package com.nopcommerce.demo.testcases;

import com.nopcommerce.demo.base.BaseTestCases;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.utilities.ConfigUtliities;
import com.nopcommerce.demo.utilities.User;
import com.nopcommerce.demo.utilities.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TS3_AddToCartTest extends BaseTestCases {
    @Test(enabled = false,description = "verify add to cart button _FUNC when clicking on it, the item must be added to the cart")
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

    @Test(enabled = false, description = "verify add to cart  _FUNC when adding multiple items to the cart, the various items must be added to the cart")
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

    @Test(enabled = false,description = "verify when clicking 'remove' item buton in the shopping cart page, item is deleted")
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

    @Test(description = "veify Adding Item to the shopping cart with different variations or configurations when not setting the options,error message appears ")
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

    @Test(enabled = false,description = "veify Adding Item to the shopping cart with different  configurations when setting the configurations, the item is added to cart")
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

    @Test(description = "verify CHECKOUT _FUNC when user does a checkout with filling all the required data, checkout is done.")
    public void TC_addToCart_06() throws InterruptedException
    {
        new LoginPage(driver)
                .load()
                .login(User.getEmail(), User.getPassword());
        Utils.navigateTo(driver , ConfigUtliities.createInstance().getHomeURL());
        new HomePage(driver)
                .apparelIconClick()
                .shoesIconClick()
                .nikeFloralIconClick();
        new NikeFloralPage(driver)
                .setConfigurations()
                .nikeFloralAddtocartButtonClick()
                .addtocartPageLinkClick();
        new CartPage(driver)
                .termsofserviceCheckboxClick()
                .checkoutButtonClick();
        ShippingMethodPage shppingMethodpage = new BillingPage(driver)
                .fillingBillingForm();
        PaymentMethodPage paymentmethodpage =  shppingMethodpage.nextDayAirOptionClick().continueButtonClick();
        PaymentInfoPage paymentinfopage = paymentmethodpage.creditCardClick().continueButtonClick();
        ConfirmOrderPage confirmOrder = new PaymentInfoPage(driver).fillConfirmOrerForm();
        CheckoutCompletedPage checkout = confirmOrder.confirmClick();
        Assert.assertTrue(checkout.isSucessMessageDisplayed());
    }//end TC_addToCart_06()

    @Test(description = "verify Add to cart _FUNC when user adds an item from the wishlist items in the wishlist page, item is added to the cart")
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