package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ElectronicsPage{
    private WebDriver driver;
    public ElectronicsPage(WebDriver driver) {

        this.driver=driver;
    }

    private By cellPhonesIcon = By.cssSelector("[title='Show products in category Cell phones']");
    public CellPhonesPage ClickOnCellPhone()  {
        Utils.scrollToElement(driver, cellPhonesIcon);
        Utils.clicking(driver,cellPhonesIcon);
        return new CellPhonesPage(driver);
    }
}
