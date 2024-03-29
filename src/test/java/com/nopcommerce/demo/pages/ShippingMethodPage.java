package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ShippingMethodPage{
    private WebDriver driver;
    public ShippingMethodPage(WebDriver driver) {
        this.driver = driver;
    }
    private By groundOption = By.id("shippingoption_0");
    private By nextDayAirOption = By.id("shippingoption_1");
    private By twoDayAirOption = By.id("shippingoption_2");
    private By continueButton = By.cssSelector(".shipping-method-next-step-button");
    public ShippingMethodPage clickOnGroundOption()
    {
        Utils.clicking(driver,groundOption);
        return this;
    }
    public ShippingMethodPage nextDayAirOptionClick()
    {
        Utils.clicking(driver,nextDayAirOption);
        return this;
    }
    public ShippingMethodPage twoDayAirOptionClick()
    {
        Utils.clicking(driver,twoDayAirOption);
        return this;
    }
    public PaymentMethodPage continueButtonClick()
    {
        Utils.clicking(driver,continueButton);
        return new PaymentMethodPage(driver);
    }


}
