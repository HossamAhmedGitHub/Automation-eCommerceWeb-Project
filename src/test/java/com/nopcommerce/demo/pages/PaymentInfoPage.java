package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PaymentInfoPage extends BasePage {
    public PaymentInfoPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "CardholderName")
    private WebElement cardholderName;
    @FindBy(id = "CardNumber")
    private WebElement cardNumber;
    @FindBy(id = "ExpireMonth")
    private WebElement expireMonth;
    @FindBy(id = "ExpireYear")
    private WebElement expireYear;
    @FindBy(id = "CardCode")
    private WebElement cardCode;
    @FindBy(css = "[class = 'button-1 payment-info-next-step-button']")
    private WebElement continueButton;

    public PaymentInfoPage fillCardholderName(String cardholderName)
    {
        this.cardholderName.sendKeys(cardholderName);
        return this;
    }
    public PaymentInfoPage fillcardNumber(String cardNumber)
    {
        this.cardNumber.sendKeys(cardNumber);
        return this;
    }
    public PaymentInfoPage fillexpireMonth()
    {
        Select expireMonthList = new Select(expireMonth);
        expireMonthList.selectByIndex(3);
        return this;
    }
    public PaymentInfoPage fillexpireYear()
    {
        Select expireYeatList = new Select(expireMonth);
        expireYeatList.selectByIndex(5);
        return this;
    }
    public PaymentInfoPage fillcardCode(String cardCode)
    {
        this.cardCode.sendKeys(cardCode);
        return this;
    }
    public ConfirmOrderPage continueButtonClick()
    {
        continueButton.click();
        return new ConfirmOrderPage(driver);
    }



}
