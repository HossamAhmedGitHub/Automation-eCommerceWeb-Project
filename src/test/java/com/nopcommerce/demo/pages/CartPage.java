package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


public class CartPage  {
    private WebDriver driver;
    public CartPage(WebDriver driver) {

        this.driver = driver;
    }

    private By noItemsLabel = By.cssSelector(".no-data");
    private By htcMobileItem = By.linkText("HTC One Mini Blue");
    private By nikeSBShoesItem = By.linkText("Nike SB Zoom Stefan Janoski \"Medium Mint\"");
    private By nikeSBShoesItemElement = By.linkText("Nike SB Zoom Stefan Janoski \"Medium Mint\"");
    private By lenovoItem = By.linkText("Lenovo IdeaCentre 600 All-in-One PC");
    private By nikeDeleteButton = By.xpath("//*[@class='cart']/tbody/tr[1]/td[@class='remove-from-cart']/button");
    private By lenovoDeleteButton = By.xpath("//*[@class='cart']/tbody/tr[2]/td[@class='remove-from-cart']/button");
    private By nikeFloralItem = By.partialLinkText("Nike Floral Roshe Customized Running Shoes");
    private By vintageRingItem = By.partialLinkText("Vintage Style Engagement Ring");
    private By termsofserviceCheckbox = By.id("termsofservice");

    private By checkoutButton = By.id("checkout");

    public boolean isnikeSBShoesItemExist(){

        return Utils.isElementExist(driver,nikeSBShoesItemElement);
    }

    public boolean isHTCAdded()
    {
        return Utils.verifyElementVisible(driver,htcMobileItem);
    }
    public boolean isNikeSBShoesAdded()
    {
        return Utils.verifyElementVisible(driver,nikeSBShoesItem);
    }
    public void deleteNikeSBShoe(){
        Utils.clicking(driver,nikeDeleteButton);
    }

    public boolean isLenovoAdded()
    {
        return Utils.verifyElementVisible(driver,lenovoItem);
    }
    public CartPage deleteNikeLenovoItems() throws InterruptedException {
        try{
            Utils.clicking(driver,nikeDeleteButton);
            Utils.clicking(driver,lenovoDeleteButton);
        }catch (NoSuchElementException e){
            System.out.println("Error: nikeDeleteButton and lenovoDeleteButton not found");
        }
        return this;
    }
    /*public boolean areLenoveNikeItemexist()
    {
        boolean retStatus = true;
        try{
            if(lenovoItem.isDisplayed() || nikeSBShoesItem.isDisplayed() )
                retStatus = true;
        }catch(NoSuchElementException e){
            retStatus = false;
        }
        return  retStatus;
    }//end isLenoveNikeexist() */
    public boolean isNikeFloralItemExisted()
    {
        return Utils.verifyElementVisible(driver,nikeFloralItem);
    }//end isNikeFloralItemDisplayed()
    public boolean isVintageRingExisted()
    {
        return Utils.verifyElementVisible(driver,nikeFloralItem);
    }//end isVintageRingDisplayed()
    public CartPage termsofserviceCheckboxClick()
    {
        Utils.clicking(driver,termsofserviceCheckbox);
        return this;
    }//end termsofserviceCheckboxClick()
    public BillingPage checkoutButtonClick()
    {
        Utils.clicking(driver, checkoutButton);
        return new BillingPage(driver);
    }//end checkoutButtonClick()

}
