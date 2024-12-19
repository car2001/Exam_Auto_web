package com.qalab.stepsdefinitions;

import com.qalab.steps.HomeSteps;
import com.qalab.steps.LoginSteps;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static com.qalab.core.DriverManager.getDriver;

public class LoginStepsDef {

    private WebDriver driver;

    private HomeSteps homeSteps(WebDriver driver){
        return new HomeSteps(driver);
    }

    @Given("me logueo con mi email {string} y clave {string}")
    public void me_logueo_con_mi_email_y_clave(String email, String password) {
        driver = getDriver();
        homeSteps(driver).clickSignIn();
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.typeEmail(email);
        loginSteps.typePassword(password);
        loginSteps.login();
        String username = homeSteps(driver).getUsername();
        Assert.assertEquals("CARLOS Pingo Aguilar",username);
    }
}
