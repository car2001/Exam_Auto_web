package com.qalab.page;

import org.openqa.selenium.By;

public class DetailProductPage {

    public static By quantityInput= By.id("quantity_wanted");
    public static By addCarButton = By.xpath("//div[@class=\"add\"]//button");
    public static By titleConfirmationAddProduct = By.id("myModalLabel");
    public static By priceSpan = By.xpath("//span[@class = 'current-price-value']");
    public static By total = By.xpath("//p[@class = 'product-total']//span[2]");
    public static By finalizePurchaseButton = By.xpath("//div[@class='cart-content-btn']//a");
}
