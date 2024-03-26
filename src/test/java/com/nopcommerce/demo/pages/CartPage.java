package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import io.qameta.allure.Feature;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css=".no-data")
    private WebElement noItemsLabel;
    @FindBy(linkText = "HTC One Mini Blue")
    private WebElement htcMobileItem;
    @FindBy(linkText = "Nike SB Zoom Stefan Janoski \"Medium Mint\"")
    private WebElement nikeShoesItem;
    @FindBy(linkText = "Lenovo IdeaCentre 600 All-in-One PC")
    private WebElement lenovoItem;
    @FindBy(xpath = "//*[@class='cart']/tbody/tr[2]/td[@class='remove-from-cart']/button")
    private WebElement nikeDeleteButton;
    @FindBy(xpath = "//*[@class='cart']/tbody/tr[2]/td[@class='remove-from-cart']/button")
    private WebElement lenovoDeleteButton;
    @FindBy(partialLinkText = "Nike Floral Roshe Customized Running Shoes")
    private WebElement nikeFloralItem;
    @FindBy(partialLinkText = "Vintage Style Engagement Ring")
    private WebElement vintageRingItem;
    @FindBy(id="termsofservice")
    private WebElement termsofserviceCheckbox;
    @FindBy(id="checkout")
    private WebElement checkoutButton;


    public boolean isCartEmpty()
    {

        return noItemsLabel.isDisplayed();
    }
    public boolean isHTCAdded()
    {
        return htcMobileItem.isDisplayed();
    }
    public boolean isNikeShoesAdded()
    {
        return nikeShoesItem.isDisplayed();
    }
    public boolean isLenovoAdded()
    {
        return lenovoItem.isDisplayed();
    }
    public CartPage deleteNikeLenovoItems() throws InterruptedException {
        try{
            nikeDeleteButton.click();
            Thread.sleep(250);
            lenovoDeleteButton.click();
        }catch (NoSuchElementException e){
            System.out.println("Error: nikeDeleteButton and lenovoDeleteButton not found");
        }
        return this;
    }
    public boolean areLenoveNikeItemexist()
    {
        boolean retStatus = true;
        try{
            if(lenovoItem.isDisplayed() || nikeShoesItem.isDisplayed() )
                retStatus = true;
        }catch(NoSuchElementException e){
            retStatus = false;
        }
        return  retStatus;
    }//end isLenoveNikeexist()
    public boolean isNikeFloralItemDisplayed()
    {
        boolean retStatus = true;
        try {
            if(nikeFloralItem.isDisplayed())
                retStatus=true;
        }catch (NoSuchElementException e)
        {
            retStatus=false;
        }
        return  retStatus;
    }//end isNikeFloralItemDisplayed()
    public boolean isVintageRingDisplayed()
    {
        boolean retStatus = true;
        try {
            if(vintageRingItem.isDisplayed())
                retStatus=true;
        }catch (NoSuchElementException e)
        {
            retStatus=false;
        }
        return  retStatus;
    }//end isVintageRingDisplayed()
    public CartPage termsofserviceCheckboxClick()
    {
        termsofserviceCheckbox.click();
        return this;
    }//end termsofserviceCheckboxClick()
    public BillingPage checkoutButtonClick()
    {
        checkoutButton.click();
        return new BillingPage(driver);
    }//end checkoutButtonClick()

}
