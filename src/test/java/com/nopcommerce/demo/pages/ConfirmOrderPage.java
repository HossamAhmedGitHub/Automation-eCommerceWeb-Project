package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmOrderPage extends BasePage {
    public ConfirmOrderPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".confirm-order-next-step-button")
    private WebElement confirm;
    public CheckoutCompletedPage confirmClick()
    {
        confirm.click();
        return new CheckoutCompletedPage(driver);
    }
}
