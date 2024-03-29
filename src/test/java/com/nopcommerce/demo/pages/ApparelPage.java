package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApparelPage {
    private WebDriver driver;
    public ApparelPage(WebDriver driver) {

        this.driver = driver;
    }
    private By shoesIcon = By.cssSelector("[title='Show products in category Shoes']");
    public ShoesPage clickOnShoesIcon()
    {
        Utils.clicking(driver,shoesIcon);
        return new ShoesPage(driver);
    }

}
