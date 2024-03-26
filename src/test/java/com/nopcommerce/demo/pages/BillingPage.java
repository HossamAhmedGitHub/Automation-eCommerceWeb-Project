package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import com.nopcommerce.demo.utilities.ConfigUtliities;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BillingPage extends BasePage {
    public BillingPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css=".edit-address")
    private WebElement editAddressForm;
    @FindBy(css="[data-trigger='country-select']")
    private WebElement country;
    @FindBy(id="BillingNewAddress_City")
    private WebElement city;
    @FindBy(id="BillingNewAddress_Address1")
    private WebElement address1;
    @FindBy(id="BillingNewAddress_ZipPostalCode")
    private WebElement zip;
    @FindBy(id="BillingNewAddress_PhoneNumber")
    private WebElement phone;
    @FindBy(css = "[class = 'button-1 new-address-next-step-button']")
    private WebElement continueButton;

    @FindBy(css ="[for='billing-address-select']")
    private WebElement autoFilledbilling;
    @FindBy(id="delete-billing-address-button")
    private WebElement deleteButton;

    public boolean isCountryFieldDisplayed() {
        System.out.println(country.isDisplayed());
        return country.isDisplayed(); // if country element is not displayed, it means the autofill is displayed
    }
    public BillingPage fillCity(String city)
    {
        this.city.sendKeys(city);
        return this;
    }
    public BillingPage fillAddress1(String address)
    {
        this.address1.sendKeys(address);
        return this;
    }
    public BillingPage setCountry()  {
        Select countries = new Select(country);
        countries.selectByIndex(5);
        return this;
    }
    public BillingPage fillZip(String zip)
    {
        this.zip.sendKeys(zip);
        return this;
    }
    public BillingPage fillPhone(String phone)
    {
        this.phone.sendKeys(phone);
        return this;
    }
    public ShippingMethodPage continueButtonClick()
    {
        continueButton.click();
        return new ShippingMethodPage(driver);
    }
    public ShippingMethodPage fillingBillingForm(){
            setCountry()
                    .fillCity(ConfigUtliities.createInstance().getCity())
                    .fillAddress1(ConfigUtliities.createInstance().getAddress1())
                    .fillZip(ConfigUtliities.createInstance().getZip())
                    .fillPhone(ConfigUtliities.createInstance().getPhoneNumber())
                    .continueButtonClick();
        return new ShippingMethodPage(driver);
    }//end fillingBillingForm()




}
