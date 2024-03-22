package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApparelPage extends BasePage {
    public ApparelPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="[title='Show products in category Shoes']")
    private WebElement shoesIcon;
    public ShoesPage shoesIconClick()
    {
        shoesIcon.click();
        return new ShoesPage(driver);
    }

}
