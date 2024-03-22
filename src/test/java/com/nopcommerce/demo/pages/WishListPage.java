package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage {
    public WishListPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css=".wishlist-add-to-cart-button")
    private WebElement addtocartButton;
    @FindBy(xpath = "//tbody/tr[1]/td[@class='add-to-cart']/input")
    private WebElement vintageRingCheckbox;
    public CartPage addtocartButtonClick()
    {
        addtocartButton.click();
        return new CartPage(driver);
    }
    public WishListPage vintageRingCheckboxClick()
    {
        vintageRingCheckbox.click();
        return this;
    }
}
