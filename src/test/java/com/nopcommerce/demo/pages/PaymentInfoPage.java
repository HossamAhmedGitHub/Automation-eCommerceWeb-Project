package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utilities.ConfigUtliities;
import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PaymentInfoPage {
    private WebDriver driver;
    public PaymentInfoPage(WebDriver driver) {
        this.driver = driver;
    }
    private By cardholderNameField = By.id("CardholderName");
    private By cardNumberField = By.id( "CardNumber");
    private By expireMonth = By.id("ExpireMonth");
    private By expireYear = By.id("ExpireYear");
    private By cardCodeField = By.id("CardCode");
    private By continueButton = By.cssSelector("[class = 'button-1 payment-info-next-step-button']");

    public PaymentInfoPage fillCardholderName(String cardholderName)
    {
        Utils.sendData(driver,cardholderNameField,cardholderName);
        return this;
    }
    public PaymentInfoPage fillcardNumber(String cardNumber)
    {
        Utils.sendData(driver,cardNumberField,cardNumber);
        return this;
    }
    public PaymentInfoPage fillexpireMonth()
    {
        Select expireMonthList = new Select(Utils.findWebElement(driver, expireMonth));
        expireMonthList.selectByIndex(3);
        return this;
    }
    public PaymentInfoPage fillexpireYear()
    {
        Select expireYeatList = new Select(Utils.findWebElement(driver, expireYear));
        expireYeatList.selectByIndex(5);
        return this;
    }
    public PaymentInfoPage fillcardCode(String cardCode)
    {
        Utils.sendData(driver,cardCodeField,cardCode);
        return this;
    }
    public ConfirmOrderPage continueButtonClick()
    {
        Utils.clicking(driver, continueButton);
        return new ConfirmOrderPage(driver);
    }
    public ConfirmOrderPage fillConfirmOrerForm(){
        fillCardholderName(ConfigUtliities.createInstance().getName())
                .fillcardNumber(ConfigUtliities.createInstance().getCardNumber())
                .fillexpireMonth()
                .fillexpireYear()
                .fillcardCode(ConfigUtliities.createInstance().getCardCode())
                .continueButtonClick();
        return new ConfirmOrderPage(driver);
    }



}
