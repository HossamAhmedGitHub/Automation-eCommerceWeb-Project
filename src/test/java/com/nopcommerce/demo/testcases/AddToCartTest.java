package com.nopcommerce.demo.testcases;

import com.nopcommerce.demo.base.BaseTestCases;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.utilities.ConfigUtliities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTestCases {
    /*@Test
    public void fillEmailPassword()
    {
        LoginPage loginObject = new LoginPage(driver);
        loginObject.load().login(ConfigUtliities.createInstance().getEmail(), ConfigUtliities.createInstance().getPassword());
    }*/
    @Test//(dependsOnMethods = "fillEmailPassword")
    public void TC_addToCart_01() throws InterruptedException {
        LoginPage loginObject = new LoginPage(driver);
        loginObject.load().login(ConfigUtliities.createInstance().getEmail(), ConfigUtliities.createInstance().getPassword());
        HtcOneMiniBluePage htcPage = new HomePage(driver)
                .electronicsIconClick()
                .cellPhonesClick()
                .htcMobileIconClick()
                .addToCartClick();
        CartPage cartpage =htcPage.addToCartLinkPageClick();
        Assert.assertTrue(cartpage.isHTCAdded());
    }//end TC_addToCart_01()

    @Test(priority = 2)
    public void TC_addToCart_02() throws InterruptedException {
        LoginPage loginObject = new LoginPage(driver);
        HomePage homePage = loginObject.load().login(ConfigUtliities.createInstance().getEmail(), ConfigUtliities.createInstance().getPassword());
        Thread.sleep(500);
        NikeShoesPage nikeshoes =homePage
                .apparelIconClick()
                .shoesIconClick()
                .nikeIconClick()
                .addToCartNikeItemButtonClick();
        Thread.sleep(1000);
        LenovoPCPage lenovopcpage= homePage
                .computerIcon()
                .desktopIconClick()
                .lenovoItemIconClick()
                .lenovoPageAddtocartButtonClick();
        CartPage cartpage =lenovopcpage.lenovoPageAddtocartPageLinkClick();
        Assert.assertTrue(cartpage.isLenovoAdded()&&cartpage.isNikeShoesAdded());
        Thread.sleep(1000);
    }//end TC_addToCart_02()
    @Test(priority = 3)
    public void TC_addToCart_03() throws InterruptedException {
        LoginPage loginObject = new LoginPage(driver);
        HomePage homePage = loginObject.load().login(ConfigUtliities.createInstance().getEmail(), ConfigUtliities.createInstance().getPassword());
        Thread.sleep(500);
        CartPage cartpage = homePage.cartPageLinkClick().deleteNikeLenovoItems();
        Assert.assertFalse(cartpage.areLenoveNikeItemexist());
    }//end TC_addToCart_03()
    @Test(priority = 4)
    public void TC_addToCart_04() throws InterruptedException
    {
        LoginPage loginObject = new LoginPage(driver);
        HomePage homePage = loginObject.load().login(ConfigUtliities.createInstance().getEmail(), ConfigUtliities.createInstance().getPassword());
        Thread.sleep(500);
        NikeFloralPage nikeflorapage = homePage
                .apparelIconClick()
                .shoesIconClick()
                .nikeFloralIconClick()
                .nikeFloralAddtocartButtonClick();
        Thread.sleep(2000);
        Assert.assertTrue(nikeflorapage.isErrorMessageDisplayed());
    }//end TC_addToCart_04()
    @Test(priority = 5)
    public void TC_addToCart_05() throws InterruptedException
    {
        LoginPage loginObject = new LoginPage(driver);
        HomePage homePage = loginObject.load().login(ConfigUtliities.createInstance().getEmail(), ConfigUtliities.createInstance().getPassword());
        Thread.sleep(500);
        NikeFloralPage nikeflorapage = homePage
                .apparelIconClick()
                .shoesIconClick()
                .nikeFloralIconClick();
        CartPage cartpage= nikeflorapage
               .setConfigurations()
               .nikeFloralAddtocartButtonClick()
               .addtocartPageLinkClick();
        Assert.assertTrue(cartpage.isNikeFloralItemDisplayed());
        Thread.sleep(2000);
    }//end TC_addToCart_05()
    @Test(priority = 6)
    public void TC_addToCart_06() throws InterruptedException
    {
        LoginPage loginObject = new LoginPage(driver);
        HomePage homePage = loginObject.load().login(ConfigUtliities.createInstance().getEmail(), ConfigUtliities.createInstance().getPassword());
        Thread.sleep(500);
        BillingPage billingpage= homePage
                .cartPageLinkClick()
                .termsofserviceCheckboxClick()
                .checkoutButtonClick();
        ShippingMethodPage shppingMethodpage = billingpage
                .setCountry()
                .fillCity("Bani suef")
                .fillAddress1("5th Neighbourhood")
                .fillZip("11758")
                .fillPhone("01098892543")
                .continueButtonClick();
        PaymentMethodPage paymentmethodpage =  shppingMethodpage.nextDayAirOptionClick().continueButtonClick();
        PaymentInfoPage paymentinfopage = paymentmethodpage.creditCardClick().continueButtonClick();
        ConfirmOrderPage confirmOrder = paymentinfopage
                .fillCardholderName("Hossam Ahmed")
                .fillcardNumber("4111111111111111")
                .fillexpireMonth()
                .fillexpireYear()
                .fillcardCode("584")
                .continueButtonClick();
        CheckoutCompletedPage checkout = confirmOrder.confirmClick();
        Assert.assertTrue(checkout.isSucessMessageDisplayed());
    }//end TC_addToCart_06()
    @Test(priority = 7)
    public void TC_addToCart_07() throws InterruptedException
    {
        LoginPage loginObject = new LoginPage(driver);
        HomePage homePage = loginObject.load().login(ConfigUtliities.createInstance().getEmail(), ConfigUtliities.createInstance().getPassword());
        Thread.sleep(500);
        WishListPage wishlistpage= homePage
                .jeweleryIconClick()
                .vintageRingIconClick()
                .addToWishListButtonClick()
                .wishlistPageLinkClick();
        CartPage cartPage=wishlistpage.vintageRingCheckboxClick().addtocartButtonClick();
        Assert.assertTrue(cartPage.isVintageRingDisplayed());
        Thread.sleep(2000);
    }//end TC_addToCart_07()

}
