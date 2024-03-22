package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import com.nopcommerce.demo.utilities.ConfigUtliities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(id = "Email")
    private WebElement emailInputField;
    @FindBy(id = "Password")
    private WebElement passwordInputField;
    //RememberMe
    @FindBy(id = "RememberMe")
    private WebElement remembermeCheckbox;
    @FindBy(css = ".login-button")
    private WebElement loginButton;
    @FindBy(xpath = "//span[@class = 'forgot-password']/a")
    private WebElement forgetPasswordLink;
    private String loginPageURL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    public LoginPage load()
    {
        driver.get(ConfigUtliities.createInstance().getURL());
        return this;
    }
    public HomePage login(String email, String password)
    {
        emailInputField.sendKeys(email);
        passwordInputField.sendKeys(password);
        loginButton.click();
        System.out.println("login success");
        return new HomePage(driver);
    }




}
