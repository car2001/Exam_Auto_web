package com.qalab.steps;

import com.qalab.page.HomePage;
import com.qalab.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HomeSteps {

    private WebDriver driver;

    public HomeSteps(WebDriver driver){
        this.driver = driver;
    }

    public void clickSignIn(){
        WebElement signInLinkElement = driver.findElement(HomePage.signInLink);
        signInLinkElement.click();
    }

    public void moveToCategory(String category){
        WebElement categoryElement = driver.findElement(HomePage.getCategoryLink(category));
        Actions actions = new Actions(driver);
        actions.moveToElement(categoryElement).perform();
    }

    public void clickSubcategory(String subcategory){
        WebElement subcategoryElement = driver.findElement(HomePage.getSubCategoryLink(subcategory));
        subcategoryElement.click();
    }

    public String getUsername(){
        WebElement usernameElement = driver.findElement(HomePage.userName);
        return usernameElement.getText();
    }

}
