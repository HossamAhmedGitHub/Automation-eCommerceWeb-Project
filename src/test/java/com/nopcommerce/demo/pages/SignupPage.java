package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import com.nopcommerce.demo.utilities.ConfigUtliities;
import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SignupPage  {
    private WebDriver driver;
    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }
    private By firstNameField = By.id("FirstName");
    private By lastNameField = By.id("LastName");
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By confirmPasswordField = By.id("ConfirmPassword");
    private By registerButton = By.id("register-button");

    private By registerationCompleteMessage = By.xpath("//*[@class='page-body']/div[@class='result']");

    public SignupPage navigateToSignupPage(){
        driver.get(ConfigUtliities.createInstance().getSignupURL());
        return this;
    }

    public SignupPage signup(String fname, String lname, String email, String password, String confirmPassword){
        Utils.sendData(driver, firstNameField, fname);
        Utils.sendData(driver, lastNameField, lname);
        Utils.sendData(driver, emailField, email);
        Utils.sendData(driver, passwordField, password);
        Utils.sendData(driver, confirmPasswordField, confirmPassword);
        return this;
    }
    public SignupPage clickOnRegisterButton(){

        Utils.clicking(driver, registerButton);
        return this;
    }
    public boolean verifySignup(){
        return Utils.verifyElementVisible(driver,registerationCompleteMessage);
    }

}
