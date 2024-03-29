package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NikeFloralPage {
    private WebDriver driver;
    public NikeFloralPage(WebDriver driver) {
        this.driver = driver;
    }
    private By nikeFloralAddtocartButton = By.id("add-to-cart-button-24") ;
    private By errorMessage = By.cssSelector(".error");
    private By sizeList = By.id("product_attribute_6");
    private By colorList = By.id("product_attribute_7");
    private By leftLabel = By.cssSelector("[for='product_attribute_8_19']");
    private By rightLabel = By.cssSelector("[for='product_attribute_8_20']");
    private By addtocartPageLink = By.cssSelector(".ico-cart");
    private By successMessage = By.cssSelector(".success");

    public NikeFloralPage clickOnNikeFloralAddtocartButton()
    {
        Utils.clicking(driver, nikeFloralAddtocartButton);
        return this;
    }
    public boolean isErrorMessageDisplayed()
    {
        return Utils.verifyElementVisible(driver,errorMessage);
    }//end verifyErrorMessage()
    public NikeFloralPage setConfigurations()
    {
        WebElement element = Utils.findWebElement(driver,sizeList);
        Select select = new Select(element);
        select.selectByIndex(1);
        element = Utils.findWebElement(driver,colorList);
        select = new Select(element);
        select.selectByIndex(1);
        Utils.clicking(driver, leftLabel);
        return this;
    }
    public CartPage addtocartPageLinkClick()
    {
        Utils.scrollToElement(driver, addtocartPageLink );
        Utils.clicking(driver,addtocartPageLink );
        return new CartPage(driver);
    }

}
