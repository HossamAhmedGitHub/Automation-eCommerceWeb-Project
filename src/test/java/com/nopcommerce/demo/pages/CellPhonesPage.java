package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CellPhonesPage extends BasePage {
    public CellPhonesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "HTC One Mini Blue")
    private WebElement htcMobileIcon;

    public HtcOneMiniBluePage htcMobileIconClick()
    {
        htcMobileIcon.click();
        return new HtcOneMiniBluePage(driver);
    }

}
