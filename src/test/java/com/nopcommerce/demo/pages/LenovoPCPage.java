package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LenovoPCPage {
    private WebDriver driver;
    public LenovoPCPage(WebDriver driver) {
        this.driver = driver;
    }

    private By lenovoPageAddtocartButton = By.id("add-to-cart-button-3");

    private By lenovoPageAddtocartPageLink = By.linkText("shopping cart");
    public LenovoPCPage clickOnLenovoPageAddtocartButton()
    {
        Utils.clicking(driver, lenovoPageAddtocartButton);
        return this;
    }
    public CartPage lenovoPageAddtocartPageLinkClick()
    {
        Utils.scrollToElement(driver,lenovoPageAddtocartPageLink );
        Utils.clicking(driver, lenovoPageAddtocartPageLink);
        return new CartPage(driver);
    }

}
