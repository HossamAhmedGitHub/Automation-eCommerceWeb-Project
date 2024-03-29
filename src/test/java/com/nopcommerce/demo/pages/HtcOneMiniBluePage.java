package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HtcOneMiniBluePage  {
    private WebDriver driver;
    public HtcOneMiniBluePage(WebDriver driver) {

        this.driver = driver;
    }

    private By addToCartButton = By.id("add-to-cart-button-19");
    private By AddtoCartLink = By.linkText("shopping cart");
    public HtcOneMiniBluePage addToCartClick()
    {
        Utils.clicking(driver,addToCartButton);
        return this;
    }
    public CartPage addToCartLinkPageClick()
    {
        Utils.scrollToElement(driver, AddtoCartLink);
        Utils.clicking(driver,AddtoCartLink);
        return new CartPage(driver);
    }

}
