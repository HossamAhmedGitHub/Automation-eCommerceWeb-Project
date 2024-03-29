package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JewelryPage  {
    private WebDriver driver;
    public JewelryPage(WebDriver driver) {

        this.driver = driver;
    }

    private By vintageRingIcon = By.partialLinkText("Vintage Style Engagement Ring");
    public VintageRingPage vintageRingIconClick()
    {
        Utils.clicking(driver,vintageRingIcon);
        return new VintageRingPage(driver);
    }
}
