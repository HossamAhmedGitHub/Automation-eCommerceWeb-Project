package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends BasePage {

    public DesktopsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Lenovo IdeaCentre 600 All-in-One PC")
    private WebElement lenovoItemIcon;
    public LenovoPCPage lenovoItemIconClick()
    {
        lenovoItemIcon.click();
        return new LenovoPCPage(driver);
    }
}
