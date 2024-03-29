package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PaymentMethodPage {
    private WebDriver driver;
    public PaymentMethodPage(WebDriver driver) {
        this.driver = driver;
    }
    private By moneyOrder = By.id("paymentmethod_0");

    private By creditCard = By.id("paymentmethod_1");
    private By continueButton = By.cssSelector("[class = 'button-1 payment-method-next-step-button']");
    public PaymentInfoPage continueButtonClick()
    {
        Utils.clicking(driver, continueButton);
        return new PaymentInfoPage(driver);
    }
    public PaymentMethodPage clickOnCreditCard()
    {
        Utils.clicking(driver, creditCard);
        return this;
    }
    public PaymentMethodPage clickOnMoneyOrder()
    {
        Utils.clicking(driver, moneyOrder);
        return this;
    }


}
