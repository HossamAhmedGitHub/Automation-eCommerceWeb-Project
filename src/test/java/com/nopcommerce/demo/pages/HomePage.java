package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver)
    {
       this.driver= driver;
    }
    private By logoutIcon = By.cssSelector(".ico-logout");
    private By electronicsIcon = By.cssSelector("ul.top-menu.notmobile > li:nth-child(2) > a");
    private By apparelIcon = By.cssSelector("ul.top-menu.notmobile > li:nth-child(3) > a");

    private By computerIcon = By.cssSelector("ul.top-menu.notmobile > li:nth-child(1) > a");

    private By jeweleryIcon = By.cssSelector("ul.top-menu.notmobile > li:nth-child(6) > a");
    private By cartPageLink = By.cssSelector(".ico-cart");
    public boolean loginVerification()
    {
        return Utils.verifyElementVisible(driver,logoutIcon);
    }

    public ElectronicsPage electronicsIconClick()
    {
        Utils.clicking(driver,electronicsIcon);
        return new ElectronicsPage(driver);
    }
    public ApparelPage clickOnApparelIcon()
    {
        Utils.clicking(driver,apparelIcon);
        return new ApparelPage(driver);
    }
    public ComputersPage clickOnComputerIcon()
    {
        Utils.clicking(driver,computerIcon);
        return new ComputersPage(driver);
    }
    public CartPage clickOnCartPageLink()
    {
        Utils.scrollToElement(driver,cartPageLink );
        Utils.clicking(driver,cartPageLink);
        return new CartPage(driver);
    }
    public JewelryPage jeweleryIconClick()
    {
        Utils.clicking(driver,jeweleryIcon);
        return new JewelryPage(driver);
    }

}
