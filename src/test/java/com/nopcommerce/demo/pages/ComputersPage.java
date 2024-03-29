package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage{
    private WebDriver driver;
    public ComputersPage(WebDriver driver) {
        this.driver = driver;
    }

    private By desktopIcon = By.cssSelector("[title='Show products in category Desktops']");
    public DesktopsPage desktopIconClick()
    {
        Utils.clicking(driver, desktopIcon);
        return new DesktopsPage(driver);
    }

}
