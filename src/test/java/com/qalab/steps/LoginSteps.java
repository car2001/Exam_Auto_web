package com.qalab.steps;

import com.qalab.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSteps {
    private WebDriver driver;

    public LoginSteps(WebDriver driver){
        this.driver = driver;
    }

    public void typeEmail(String email){
        WebElement emailInputElement = driver.findElement(LoginPage.emailInput);
        emailInputElement.sendKeys(email);
    }

    public void typePassword(String password){
        WebElement emailInputElement = driver.findElement(LoginPage.passwordInput);
        emailInputElement.sendKeys(password);
    }

    public void login(){
        WebElement submitButtonElement = driver.findElement(LoginPage.submitButton);
        submitButtonElement.click();
    }

}
