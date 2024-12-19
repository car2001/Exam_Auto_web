package com.qalab.stepsdefinitions;

import com.qalab.steps.ClothesMenSteps;
import com.qalab.steps.DetailProductSteps;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Do;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static com.qalab.core.DriverManager.getDriver;

public class ClothesMenStepsDef {

    private WebDriver driver;
    private Double quantity;

    private DetailProductSteps detailProductSteps(WebDriver driver){
        return new DetailProductSteps(driver);
    }
    @When("agrego {string} unidades del primer producto al carrito")
    public void agrego_unidades_del_primer_producto_al_carrito(String quantity) {
        driver = getDriver();
        this.quantity = Double.parseDouble(quantity);
        ClothesMenSteps clothesMenStep = new ClothesMenSteps(driver);
        clothesMenStep.clickFirstProduct();
        detailProductSteps(driver).typeQuantityProduct(quantity);
        detailProductSteps(driver).clickAddCarButton();
    }

    @When("valido en el popup la confirmación del producto agregado")
    public void valido_en_el_popup_la_confirmación_del_producto_agregado()  {
        String messageActualConfirmation = detailProductSteps(driver).getMessageConfirmationAddProduct();
        Assert.assertEquals("Product successfully added to your shopping cart", messageActualConfirmation.substring(1));
    }

    @When("valido en el popup que el monto total sea calculado correctamente")
    public void valido_en_el_popup_que_el_monto_total_sea_calculado_correctamente() {
        Double price = detailProductSteps(driver).getPriceProduct();
        Double totalActual = detailProductSteps(driver).getTotal();
        Double totalExpected = price * this.quantity;
        Assert.assertEquals(totalExpected,totalActual);
    }

    @When("finalizo la compra")
    public void finalizo_la_compra() {
        detailProductSteps(driver).clickFinalizePurchase();
    }

}
