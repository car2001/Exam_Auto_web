package com.qalab.steps;

import com.qalab.page.DetailProductPage;
import com.qalab.page.LoginPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DetailProductSteps {

    private WebDriver driver;

    public DetailProductSteps(WebDriver driver){
        this.driver = driver;
    }

    public void typeQuantityProduct (String quantity){
        WebElement quantityInputElement = driver.findElement(DetailProductPage.quantityInput);
        quantityInputElement.click();
        quantityInputElement.sendKeys(Keys.CONTROL + "a");
        quantityInputElement.sendKeys(Keys.DELETE);
        quantityInputElement.sendKeys(quantity);
    }

    public void clickAddCarButton(){
        WebElement addCardBtnElement = driver.findElement(DetailProductPage.addCarButton);
        addCardBtnElement.click();
    }

    public String getMessageConfirmationAddProduct(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(DetailProductPage.titleConfirmationAddProduct));
        WebElement messageElement = driver.findElement(DetailProductPage.titleConfirmationAddProduct);
        return  messageElement.getText();
    }

    public Double getPriceProduct(){
        WebElement priceSpanElement = driver.findElement(DetailProductPage.priceSpan);
        String price = priceSpanElement.getAttribute("content");
        return Double.parseDouble(price);
    }

    public Double getTotal(){
        WebElement totalElement = driver.findElement(DetailProductPage.total);
        String total = totalElement.getText().replaceAll("[^\\d.]", "");
        System.out.println(total);
        return Double.parseDouble(total);
    }

    public void clickFinalizePurchase(){
        WebElement finalizePurchaseButtonElement = driver.findElement(DetailProductPage.finalizePurchaseButton);
        finalizePurchaseButtonElement.click();
    }
}
