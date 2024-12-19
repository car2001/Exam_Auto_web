package com.qalab.page;

import org.openqa.selenium.By;

public class HomePage {

    public static By signInLink= By.xpath("//div[@id='_desktop_user_info']//a[@title=\"Log in to your customer account\"]");
    public static  By userName = By.xpath("//div[@class='user-info']//a//span[@class='hidden-sm-down']");

    public static By getCategoryLink(String categoryName) {
        return By.xpath("//li[@class='category']//a[contains(normalize-space(), '" + categoryName + "')]");
    }

    public static  By getSubCategoryLink(String subcategoryName){
        return  By.xpath("//a[@class='dropdown-item dropdown-submenu' and contains(normalize-space(), '"+subcategoryName+"')]");
    }
}
