package com.qalab.stepsdefinitions;

import com.qalab.steps.HomeSteps;
import com.qalab.steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.qalab.core.DriverManager.getDriver;
import static com.qalab.core.DriverManager.screenShot;

public class HomeStepsDef {

    private WebDriver driver;

    @Given("estoy en la página de la tienda")
    public void estoy_en_la_página_de_la_tienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/en/");
        screenShot();
    }

    @When("navego a la categoria {string} y subcategoria {string}")
    public void navego_a_la_categoria_y_subcategoria(String category, String subcategory) {
        HomeSteps homeSteps = new HomeSteps(driver);
        homeSteps.moveToCategory(category);
        homeSteps.clickSubcategory(subcategory);
    }
}
