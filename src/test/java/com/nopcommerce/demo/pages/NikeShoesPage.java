package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NikeShoesPage extends BasePage {

    public NikeShoesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="add-to-cart-button-26")
    private WebElement addToCartNikeItemButton;
    @FindBy(linkText = "shopping cart")
    private WebElement cartLink;
    public NikeShoesPage addToCartNikeItemButtonClick()
    {
        addToCartNikeItemButton.click();
        return this;
    }
    public CartPage cartLinkClick()
    {
        cartLink.click();
        return new CartPage(driver);
    }

}
