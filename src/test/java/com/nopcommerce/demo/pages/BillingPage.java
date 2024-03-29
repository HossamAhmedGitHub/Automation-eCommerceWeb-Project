package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.ConfigUtliities;
import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BillingPage {
    private WebDriver driver;

    public BillingPage(WebDriver driver) {

        this.driver = driver;
    }

    private By editAddressForm = By.cssSelector(".edit-address");
    private By country = By.cssSelector("[data-trigger='country-select']");

    private By cityField = By.id("BillingNewAddress_City");

    private By address1 = By.id("BillingNewAddress_Address1");
    private By zipField = By.id("BillingNewAddress_ZipPostalCode");
    private By phoneField = By.id("BillingNewAddress_PhoneNumber");
    private By continueButton = By.cssSelector("[class = 'button-1 new-address-next-step-button']");
    private By autoFilledbilling = By.cssSelector("[for='billing-address-select']");
    private By deleteButton = By.id("delete-billing-address-button");

    public BillingPage fillCity(String city)
    {
        Utils.sendData(driver , cityField , city);
        return this;
    }
    public BillingPage fillAddress1(String address)
    {
        Utils.sendData(driver , address1 , address);
        return this;
    }
    public BillingPage setCountry()  {
        WebElement element = Utils.findWebElement(driver, country);
        Select countries = new Select(element);
        countries.selectByIndex(5);
        return this;
    }
    public BillingPage fillZip(String zip)
    {
        Utils.sendData(driver , zipField , zip);
        return this;
    }
    public BillingPage fillPhone(String phone)
    {
        Utils.sendData(driver, phoneField,phone);
        return this;
    }
    public ShippingMethodPage clickOnContinueButton()
    {
        Utils.clicking(driver,continueButton);
        return new ShippingMethodPage(driver);
    }
    public ShippingMethodPage fillingBillingForm(){
            setCountry()
                    .fillCity(ConfigUtliities.createInstance().getCity())
                    .fillAddress1(ConfigUtliities.createInstance().getAddress1())
                    .fillZip(ConfigUtliities.createInstance().getZip())
                    .fillPhone(ConfigUtliities.createInstance().getPhoneNumber())
                    .clickOnContinueButton();
        return new ShippingMethodPage(driver);
    }//end fillingBillingForm()




}
