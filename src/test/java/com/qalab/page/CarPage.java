package com.qalab.page;

import org.openqa.selenium.By;

public class CarPage {

    public static By inputQuantity = By.xpath("//div[@class='input-group bootstrap-touchspin']//input");
    public static By totalSpanSummary = By.xpath("//div[@class='cart-summary-line cart-total']//span[2]");
    public static By totalSpan = By.xpath("//div[@class='col-md-6 col-xs-2 price']//span//strong");
    public static  By  price = By.xpath("//span[@class='price']");
}
