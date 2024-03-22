package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentMethodPage extends BasePage {
    public PaymentMethodPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="paymentmethod_0")
    private WebElement moneyOrder;
    @FindBy(id="paymentmethod_1")
    private WebElement creditCard;
    @FindBy(css = "[class = 'button-1 payment-method-next-step-button']")
    private WebElement continueButton;
    public PaymentInfoPage continueButtonClick()
    {
        continueButton.click();
        return new PaymentInfoPage(driver);
    }
    public PaymentMethodPage creditCardClick()
    {
        creditCard.click();
        return this;
    }
    public PaymentMethodPage moneyOrderClick()
    {
        moneyOrder.click();
        return this;
    }


}
