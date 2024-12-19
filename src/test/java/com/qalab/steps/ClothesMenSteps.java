package com.qalab.steps;

import com.qalab.page.ClothesMenPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClothesMenSteps {

    private WebDriver driver;

    public ClothesMenSteps(WebDriver driver){
        this.driver = driver;
    }

    public void clickFirstProduct(){
        WebElement firsProductElement = driver.findElement(ClothesMenPage.firstProduct);
        firsProductElement.click();
    }
}
