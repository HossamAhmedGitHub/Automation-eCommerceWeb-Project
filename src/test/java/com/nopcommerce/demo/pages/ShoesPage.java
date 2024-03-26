package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoesPage extends BasePage {

    public ShoesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Nike SB Zoom Stefan Janoski \"Medium Mint\"")
    private WebElement nikeSBIcon;
    @FindBy(linkText = "Nike Floral Roshe Customized Running Shoes")
    private WebElement nikeFloralIcon;
    public NikeShoesPage nikeSBIconClick()
    {
        nikeSBIcon.click();
        return new NikeShoesPage(driver);
    }
    public NikeFloralPage nikeFloralIconClick()
    {
        nikeFloralIcon.click();
        return new NikeFloralPage(driver);
    }


}
