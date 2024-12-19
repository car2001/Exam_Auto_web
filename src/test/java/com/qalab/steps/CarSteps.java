package com.qalab.steps;

import com.qalab.page.CarPage;
import com.qalab.page.DetailProductPage;
import io.cucumber.java.eo.Do;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarSteps {
    private WebDriver driver;

    public CarSteps(WebDriver driver){
        this.driver = driver;
    }

    public String getTitleCarPage(){
        return this.driver.getTitle();
    }

    public Double getTotal(){
        WebElement totalElement = driver.findElement(CarPage.totalSpan);
        String total = totalElement.getText().replaceAll("[^\\d.]", "");
        System.out.println(total);
        return Double.parseDouble(total);
    }

    public Double getTotalSummary(){
        WebElement totalElement = driver.findElement(CarPage.totalSpanSummary);
        String total = totalElement.getText().trim().replaceAll("[^\\d.]", "");
        System.out.println(total);
        return Double.parseDouble(total);
    }

    public Integer getQuantity(){
        WebElement inputQuantityElement = driver.findElement(CarPage.inputQuantity);
        String quantity = inputQuantityElement.getAttribute("value");
        return Integer.parseInt(quantity);
    }

    public Double getPrice(){
        WebElement priceElement = driver.findElement(CarPage.price);
        String price = priceElement.getText().trim().replaceAll("[^\\d.]", "");
        return  Double.parseDouble(price);
    }
}
