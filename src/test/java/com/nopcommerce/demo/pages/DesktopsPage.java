package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage {
    private WebDriver driver;

    public DesktopsPage(WebDriver driver) {
        this.driver = driver;
    }

    private By lenovoItemIcon = By.linkText("Lenovo IdeaCentre 600 All-in-One PC");
    public LenovoPCPage lenovoItemIconClick()
    {
        Utils.clicking(driver, lenovoItemIcon);
        return new LenovoPCPage(driver);
    }
}
