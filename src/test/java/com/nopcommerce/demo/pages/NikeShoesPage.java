package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NikeShoesPage  {
    private WebDriver driver;
    public NikeShoesPage(WebDriver driver) {

        this.driver = driver;
    }

    private By addToCartNikeItemButton = By.id("add-to-cart-button-26");

    private By cartLink = By.linkText("shopping cart");
    public NikeShoesPage clickOnAddToCartNikeItemButton()
    {
        Utils.clicking(driver,addToCartNikeItemButton);
        return this;
    }
    public CartPage clicoOnCartLink()
    {
        Utils.clicking(driver,cartLink);
        return new CartPage(driver);
    }

}
