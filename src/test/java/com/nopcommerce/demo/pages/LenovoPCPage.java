package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LenovoPCPage extends BasePage {
    public LenovoPCPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="add-to-cart-button-3")
    private WebElement lenovoPageAddtocartButton;
    @FindBy(linkText = "shopping cart")
    private WebElement lenovoPageAddtocartPageLink;
    public LenovoPCPage lenovoPageAddtocartButtonClick()
    {
        lenovoPageAddtocartButton.click();
        return this;
    }
    public CartPage lenovoPageAddtocartPageLinkClick()
    {
        Utils.scrollToElement(driver,lenovoPageAddtocartPageLink );
        lenovoPageAddtocartPageLink.click();
        return new CartPage(driver);
    }

}
