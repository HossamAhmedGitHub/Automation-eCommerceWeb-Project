package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoesPage {
    private WebDriver driver;
    public ShoesPage(WebDriver driver) {
        this.driver = driver;
    }

    private By nikeSBIcon = By.linkText("Nike SB Zoom Stefan Janoski \"Medium Mint\"");

    private By nikeFloralIcon = By.linkText("Nike Floral Roshe Customized Running Shoes");
    public NikeShoesPage ClickOnNikeSBIcon()
    {
        Utils.clicking(driver, nikeSBIcon);
        return new NikeShoesPage(driver);
    }
    public NikeFloralPage clickOnNikeFloralIcon()
    {
        Utils.clicking(driver, nikeFloralIcon);
        return new NikeFloralPage(driver);
    }


}
