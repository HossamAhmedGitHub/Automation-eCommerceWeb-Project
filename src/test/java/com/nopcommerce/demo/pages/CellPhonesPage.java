package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CellPhonesPage{
    private WebDriver driver;
    public CellPhonesPage(WebDriver driver) {

        this.driver = driver;
    }

    private By htcMobileIcon = By.linkText("HTC One Mini Blue");

    public HtcOneMiniBluePage ClickOnHtcMobile()
    {
        Utils.clicking(driver, htcMobileIcon);
        return new HtcOneMiniBluePage(driver);
    }

}
