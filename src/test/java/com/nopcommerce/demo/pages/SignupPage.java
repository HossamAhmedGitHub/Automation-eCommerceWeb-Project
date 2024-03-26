package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import com.nopcommerce.demo.utilities.ConfigUtliities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {

    public SignupPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "FirstName")
    private WebElement firstNameField;
    @FindBy(id = "LastName")
    private WebElement lastNameField;
    @FindBy(id = "Email")
    private WebElement emailField;
    @FindBy(id = "Password")
    private WebElement passwordField;
    @FindBy(id = "ConfirmPassword")
    private WebElement confirmPasswordField;
    @FindBy(id = "register-button")
    private WebElement registerButton;
    @FindBy(xpath = "//*[@class='page-body']/div[@class='result']")
    private WebElement registerationCompleteMessage;

    public SignupPage navigateToSignupPage(){
        driver.get(ConfigUtliities.createInstance().getSignupURL());
        return this;
    }

    public SignupPage signup(String fname, String lname, String email, String password, String confirmPassword){
       firstNameField.sendKeys(fname);
       lastNameField.sendKeys(lname);
       emailField.sendKeys(email);
       passwordField.sendKeys(password);
       confirmPasswordField.sendKeys(confirmPassword);
        return this;
    }
    public SignupPage clickOnRegisterButton(){
        registerButton.click();
        return this;
    }
    public boolean verifySignup(){
        return registerationCompleteMessage.isDisplayed();
    }

}
