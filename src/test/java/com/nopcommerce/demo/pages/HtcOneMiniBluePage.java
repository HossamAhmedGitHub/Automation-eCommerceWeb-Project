package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HtcOneMiniBluePage extends BasePage {
    public HtcOneMiniBluePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "add-to-cart-button-19")
    private WebElement addToCartButton;
    @FindBy(linkText = "shopping cart")
    private WebElement AddtoCartLink;
    public HtcOneMiniBluePage addToCartClick()
    {
        addToCartButton.click();
        return this;
    }
    public CartPage addToCartLinkPageClick()
    {
        Utils.scrollToElement(driver, AddtoCartLink);
        AddtoCartLink.click();
        return new CartPage(driver);
    }

}
