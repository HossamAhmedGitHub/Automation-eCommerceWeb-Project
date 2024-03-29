package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage{
    private WebDriver driver;
    public WishListPage(WebDriver driver) {
        this.driver = driver;
    }

    private By addtocartButton = By.cssSelector(".wishlist-add-to-cart-button");
    private By vintageRingCheckbox = By.xpath("//tbody/tr[1]/td[@class='add-to-cart']/input");
    public CartPage clickOnAddtocartButton()
    {
        Utils.clicking(driver,addtocartButton);
        return new CartPage(driver);
    }
    public WishListPage clickOnvintageRingCheckbox()
    {
        Utils.clicking(driver,vintageRingCheckbox);
        return this;
    }
}
