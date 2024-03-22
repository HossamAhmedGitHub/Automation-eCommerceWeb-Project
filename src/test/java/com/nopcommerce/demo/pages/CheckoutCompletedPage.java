package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletedPage extends BasePage {
    public CheckoutCompletedPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".order-completed-continue-button")
    private WebElement continueButton;
    @FindBy(css ="[class = 'section order-completed']")
    private WebElement successMessage;
    public void continueButtonClick()
    {
        continueButton.click();
    }
    public boolean isSucessMessageDisplayed()
    {
        boolean retStatus = false;
        try{
            if(successMessage.isDisplayed())
                retStatus = true;
        }catch (NoSuchElementException e){
            retStatus = false;
        }
        return retStatus;
    }
}
