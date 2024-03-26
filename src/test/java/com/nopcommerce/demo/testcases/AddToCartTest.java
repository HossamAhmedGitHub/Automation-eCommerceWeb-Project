package com.nopcommerce.demo.testcases;

import com.nopcommerce.demo.base.BaseTestCases;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.utilities.ConfigUtliities;
import com.nopcommerce.demo.utilities.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddToCartTest extends BaseTestCases {
    @Test(description = "verify add to cart button _FUNC when clicking on it, the item must be added to the cart")
    public void TC_addToCart_01()  {
        Utils.navigateTo(driver , ConfigUtliities.createInstance().getHomeURL());
        HtcOneMiniBluePage htcPage = new HomePage(driver)
                .electronicsIconClick()
                .cellPhonesClick()
                .htcMobileIconClick()
                .addToCartClick();
        CartPage cartpage =htcPage.addToCartLinkPageClick();
        Assert.assertTrue(cartpage.isHTCAdded());
    }//end TC_addToCart_01()

    @Test(enabled = true, description = "verify add to cart  _FUNC when adding multiple items to the cart, the various items must be added to the cart")
    public void TC_addToCart_02() {
        Utils.navigateTo(driver , ConfigUtliities.createInstance().getHomeURL());
        new HomePage(driver)
                .apparelIconClick()
                .shoesIconClick()
                .nikeSBIconClick()
                .addToCartNikeItemButtonClick();
        Utils.navigateTo(driver , ConfigUtliities.createInstance().getHomeURL());
        LenovoPCPage lenovopcpage= new HomePage(driver)
                .computerIcon()
                .desktopIconClick()
                .lenovoItemIconClick()
                .lenovoPageAddtocartButtonClick();
        CartPage cartpage =lenovopcpage.lenovoPageAddtocartPageLinkClick();
        Assert.assertTrue(cartpage.isLenovoAdded() && cartpage.isNikeSBShoesAdded());
    }//end TC_addToCart_02()
    @Test(enabled = true, description = "verify when clicking 'remove' item buton in the shopping cart page, item is deleted")
    public void TC_addToCart_03()  {
        Utils.navigateTo(driver , ConfigUtliities.createInstance().getHomeURL());
        new HomePage(driver)
                .apparelIconClick()
                .shoesIconClick()
                .nikeSBIconClick()
                .addToCartNikeItemButtonClick();
        CartPage cartpage = new HomePage(driver).cartPageLinkClick();
        new SoftAssert().assertTrue(cartpage.isNikeSBShoesAdded());
        cartpage.deleteNikeSBShoe();
        Assert.assertFalse(cartpage.isnikeSBShoesItemExist());
    }//end TC_addToCart_03()
    @Test(enabled = true,description = "veify Adding Item to the shopping cart with different variations or configurations when not setting the options,error message appears ")
    public void TC_addToCart_04()
    {
        Utils.navigateTo(driver , ConfigUtliities.createInstance().getHomeURL());
        NikeFloralPage nikeflorapage = new HomePage(driver)
                .apparelIconClick()
                .shoesIconClick()
                .nikeFloralIconClick()
                .nikeFloralAddtocartButtonClick();
        Assert.assertTrue(nikeflorapage.isErrorMessageDisplayed());
    }//end TC_addToCart_04()
    @Test(enabled = true, description = "veify Adding Item to the shopping cart with different  configurations when setting the configurations, the item is added to cart")
    public void TC_addToCart_05(){
        Utils.navigateTo(driver , ConfigUtliities.createInstance().getHomeURL());
        NikeFloralPage nikeflorapage = new HomePage(driver)
                .apparelIconClick()
                .shoesIconClick()
                .nikeFloralIconClick();
        CartPage cartpage= nikeflorapage
               .setConfigurations()
               .nikeFloralAddtocartButtonClick()
               .addtocartPageLinkClick();
        Assert.assertTrue(cartpage.isNikeFloralItemDisplayed());
    }//end TC_addToCart_05()
    @Test(enabled = false,description = "verify CHECKOUT _FUNC when user does a checkout with filling all the required data, checkout is done.")
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
    @Test(enabled = true,description = "verify Add to cart _FUNC when user adds an item from the wishlist items in the wishlist page, item is added to the cart")
    public void TC_addToCart_07() {
        Utils.navigateTo(driver , ConfigUtliities.createInstance().getHomeURL());
        WishListPage wishlistpage= new HomePage(driver)
                .jeweleryIconClick()
                .vintageRingIconClick()
                .addToWishListButtonClick()
                .wishlistPageLinkClick();
        CartPage cartPage=wishlistpage.vintageRingCheckboxClick().addtocartButtonClick();
        Assert.assertTrue(cartPage.isVintageRingDisplayed());
    }//end TC_addToCart_07()

}
