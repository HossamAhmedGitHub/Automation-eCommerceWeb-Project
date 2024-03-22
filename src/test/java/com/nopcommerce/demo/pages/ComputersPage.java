package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage extends BasePage {
    public ComputersPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (css="[title='Show products in category Desktops']")
    private WebElement desktopIcon;
    public DesktopsPage desktopIconClick()
    {
        desktopIcon.click();
        return new DesktopsPage(driver);
    }

}
