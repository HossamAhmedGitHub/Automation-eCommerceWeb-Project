package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NikeFloralPage extends BasePage {
    public NikeFloralPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="add-to-cart-button-24")
    private WebElement nikeFloralAddtocartButton;
    @FindBy(css = ".error")
    private WebElement errorMessage;
    @FindBy(id= "product_attribute_6")
    private WebElement sizeList;
    @FindBy(id= "product_attribute_7")
    private WebElement colorList;
    @FindBy(css = "[for='product_attribute_8_19']")
    private WebElement leftLabel;
    @FindBy(css = "[for='product_attribute_8_20']")
    private WebElement rightLabel;
    @FindBy(css = ".success a")
    private WebElement addtocartPageLink;
    @FindBy(css = ".success")
    private WebElement successMessage;

    public NikeFloralPage nikeFloralAddtocartButtonClick()
    {
        nikeFloralAddtocartButton.click();
        return this;
    }
    public boolean isErrorMessageDisplayed()
    {
        boolean retStatus = false;
        try{
            if(errorMessage.isDisplayed())
                retStatus=true;
        }catch (NoSuchElementException e){
            retStatus=false;
        }//end catch
        return retStatus;
    }//end verifyErrorMessage()
    public NikeFloralPage setConfigurations()
    {
        Select select = new Select(sizeList);
        select.selectByIndex(1);
        select = new Select(colorList);
        select.selectByIndex(1);
        leftLabel.click();
        return this;
    }
    public CartPage addtocartPageLinkClick()
    {
        addtocartPageLink.click();
        return new CartPage(driver);
    }

}
