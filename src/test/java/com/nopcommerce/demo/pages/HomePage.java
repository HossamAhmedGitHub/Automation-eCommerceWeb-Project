package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(css = ".ico-logout")
    private WebElement logoutIcon;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(2) > a")
    private WebElement electronicsIcon;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(3) > a")
    private WebElement apparelIcon;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(1) > a")
    private WebElement computerIcon;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(6) > a")
    private WebElement jeweleryIcon;
    @FindBy(css = ".ico-cart")
    private WebElement cartPageLink;
    public boolean loginVerification()
    {
        return logoutIcon.isDisplayed();
    }

    public ElectronicsPage electronicsIconClick()
    {
        electronicsIcon.click();
        return new ElectronicsPage(driver);
    }
    public ApparelPage apparelIconClick()
    {
        apparelIcon.click();
        return new ApparelPage(driver);
    }
    public ComputersPage computerIcon()
    {
        computerIcon.click();
        return new ComputersPage(driver);
    }
    public CartPage cartPageLinkClick()
    {

        cartPageLink.click();
        return new CartPage(driver);
    }
    public JewelryPage jeweleryIconClick()
    {
        jeweleryIcon.click();
        return new JewelryPage(driver);
    }

}
