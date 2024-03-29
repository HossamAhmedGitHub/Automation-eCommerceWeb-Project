package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletedPage  {
    private WebDriver driver;
    public CheckoutCompletedPage(WebDriver driver) {
        this.driver = driver;
    }
    private By continueButton = By.cssSelector(".order-completed-continue-button");
    private By successMessage = By.cssSelector("[class = 'section order-completed']");
    public void clickOncontinueButton()
    {
        Utils.clicking(driver,continueButton);
    }
    public boolean isSucessMessageDisplayed()
    {
        return Utils.verifyElementVisible(driver,successMessage);
    }
}
