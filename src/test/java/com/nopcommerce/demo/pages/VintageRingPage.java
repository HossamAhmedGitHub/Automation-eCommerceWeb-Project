package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VintageRingPage extends BasePage {
    public VintageRingPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="add-to-wishlist-button-42")
    private WebElement addToWishListButton;
    @FindBy(linkText = "wishlist")
    private WebElement wishlistPageLink;
    public VintageRingPage addToWishListButtonClick()
    {
        addToWishListButton.click();
        return this;
    }
    public WishListPage wishlistPageLinkClick()
    {
        wishlistPageLink.click();
        return new WishListPage(driver);
    }
}
