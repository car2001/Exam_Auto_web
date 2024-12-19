package com.qalab.stepsdefinitions;

import com.qalab.steps.CarSteps;
import com.qalab.steps.LoginSteps;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static com.qalab.core.DriverManager.getDriver;

public class CarStepsDef {

    private WebDriver driver;
    @Then("valido el titulo de la pagina del carrito")
    public void valido_el_titulo_de_la_pagina_del_carrito() {
        driver = getDriver();
        CarSteps carSteps = new CarSteps(driver);
        String actualTitle = carSteps.getTitleCarPage();
        Assert.assertEquals("Cart", actualTitle);
    }

    @Then("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvo_a_validar_el_calculo_de_precios_en_el_carrito() {
        CarSteps carSteps = new CarSteps(driver);
        Integer quantity = carSteps.getQuantity();
        Double actualTotal = carSteps.getTotal();
        Double actualTotalSummary = carSteps.getTotalSummary();
        Double price = carSteps.getPrice();

        Double totalExpected = quantity * price;
        Assert.assertEquals(totalExpected,actualTotal);
        Assert.assertEquals(totalExpected,actualTotalSummary);
    }
}
