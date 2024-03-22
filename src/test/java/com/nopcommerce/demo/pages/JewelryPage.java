package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JewelryPage extends BasePage {
    public JewelryPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(partialLinkText = "Vintage Style Engagement Ring")
    private WebElement vintageRingIcon;
    public VintageRingPage vintageRingIconClick()
    {
        vintageRingIcon.click();
        return new VintageRingPage(driver);
    }
}
