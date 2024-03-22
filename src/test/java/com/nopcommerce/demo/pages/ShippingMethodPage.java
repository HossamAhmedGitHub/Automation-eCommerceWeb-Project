package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingMethodPage extends BasePage {
    public ShippingMethodPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="shippingoption_0")
    private WebElement groundOption;
    @FindBy(id="shippingoption_1")
    private WebElement nextDayAirOption;
    @FindBy(id="shippingoption_2")
    private WebElement twoDayAirOption;
    @FindBy(css=".shipping-method-next-step-button")
    private WebElement continueButton;
    public ShippingMethodPage groundOptionClick()
    {
        groundOption.click();
        return this;
    }
    public ShippingMethodPage nextDayAirOptionClick()
    {
        nextDayAirOption.click();
        return this;
    }
    public ShippingMethodPage twoDayAirOptionClick()
    {
        twoDayAirOption.click();
        return this;
    }
    public PaymentMethodPage continueButtonClick()
    {
        continueButton.click();
        return new PaymentMethodPage(driver);
    }


}
