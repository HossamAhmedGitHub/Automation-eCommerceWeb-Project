package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utilities.ConfigUtliities;
import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage  {

    private WebDriver driver;
    private final String loginPageURL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    public LoginPage(WebDriver driver)
    {

        this.driver=driver;
    }
    /*      Locators        */
    private By emailInputField = By.id("Email");
    private By passwordInputField = By.id("Password");
    private By remembermeCheckbox = By.id("RememberMe");

    private By loginButton = By.cssSelector(".login-button");
    private By forgetPasswordLink = By.xpath("//span[@class = 'forgot-password']/a");

    public LoginPage load()
    {
        driver.get(ConfigUtliities.createInstance().getURL());
        return this;
    }
    public HomePage login(String email, String password)
    {
        Utils.sendData(driver, emailInputField, email);
        Utils.sendData(driver,passwordInputField,password);
        Utils.clicking(driver,loginButton);
        return new HomePage(driver);
    }




}
