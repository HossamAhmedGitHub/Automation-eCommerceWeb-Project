package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VintageRingPage {
    private WebDriver driver;
    public VintageRingPage(WebDriver driver) {
        this.driver = driver;
    }

    private By addToWishListButton = By.id("add-to-wishlist-button-42");
    private By wishlistPageLink = By.linkText("wishlist");
    public VintageRingPage clickOnAddToWishListButton()
    {
        Utils.clicking(driver, addToWishListButton);
        return this;
    }
    public WishListPage wishlistPageLinkClick()
    {
        Utils.clicking(driver, wishlistPageLink);
        return new WishListPage(driver);
    }
}
