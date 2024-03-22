package com.nopcommerce.demo.pages;

import com.google.common.collect.Table;
import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePage {

    public ElectronicsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[title='Show products in category Cell phones']")
    private WebElement cellPhonesIcon;
    public CellPhonesPage cellPhonesClick() throws InterruptedException {
        JavascriptExecutor jse =(JavascriptExecutor)driver;
        Thread.sleep(1000);
        jse.executeScript("arguments[0].scrollIntoView()",cellPhonesIcon);
        Thread.sleep(1000);
        cellPhonesIcon.click();
        return new CellPhonesPage(driver);
    }
}
