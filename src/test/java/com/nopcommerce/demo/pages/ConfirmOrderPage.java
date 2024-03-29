package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmOrderPage{
    private WebDriver driver;
    public ConfirmOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    private By confirm = By.cssSelector(".confirm-order-next-step-button");
    public CheckoutCompletedPage clickOnConfirm()
    {
        Utils.clicking(driver,confirm);
        return new CheckoutCompletedPage(driver);
    }
}
