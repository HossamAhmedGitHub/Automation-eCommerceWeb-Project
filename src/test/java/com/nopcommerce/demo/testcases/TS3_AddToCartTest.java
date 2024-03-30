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
    @Test(description = "verify add to cart button _FUNC when clicking on it, the item must be added to the cart")
    public void TC_addToCart_01()  {
        Utils.navigateTo(driver , ConfigUtliities.createInstance().getHomeURL());
         new HomePage(driver)
                .electronicsIconClick()
                .ClickOnCellPhone()
                .ClickOnHtcMobile()
                .addToCartClick();
        new HomePage(driver).clickOnCartPageLink();
        Assert.assertTrue(new CartPage(driver).isHTCAdded());
    }//end TC_addToCart_01()

    @Test(description = "verify add to cart  _FUNC when adding multiple items to the cart, the various items must be added to the cart")
    public void TC_addToCart_02() {
        Utils.navigateTo(driver , ConfigUtliities.createInstance().getHomeURL());
        new HomePage(driver)
                .clickOnApparelIcon()
                .clickOnShoesIcon()
                .ClickOnNikeSBIcon()
                .clickOnAddToCartNikeItemButton();
        Utils.navigateTo(driver , ConfigUtliities.createInstance().getHomeURL());
        new HomePage(driver)
                .clickOnComputerIcon()
                .desktopIconClick()
                .lenovoItemIconClick()
                .clickOnLenovoPageAddtocartButton();
        CartPage cartpage =new HomePage(driver).clickOnCartPageLink();
        Assert.assertTrue(cartpage.isLenovoAdded() && cartpage.isNikeSBShoesAdded());
    }//end TC_addToCart_02()

    @Test(description = "verify when clicking 'remove' item buton in the shopping cart page, item is deleted")
    public void TC_addToCart_03()  {
        Utils.navigateTo(driver , ConfigUtliities.createInstance().getHomeURL());
        new HomePage(driver)
                .clickOnApparelIcon()
                .clickOnShoesIcon()
                .ClickOnNikeSBIcon()
                .clickOnAddToCartNikeItemButton();
        CartPage cartpage = new HomePage(driver).clickOnCartPageLink();
        new SoftAssert().assertTrue(cartpage.isNikeSBShoesAdded());
        cartpage.deleteNikeSBShoe();
        Assert.assertFalse(cartpage.isnikeSBShoesItemExist());
    }//end TC_addToCart_03()

    @Test(enabled = false, description = "veify Adding Item to the shopping cart with different variations or configurations when not setting the options,error message appears ")
    public void TC_addToCart_04()
    {
        Utils.navigateTo(driver , ConfigUtliities.createInstance().getHomeURL());
        NikeFloralPage nikeflorapage = new HomePage(driver)
                .clickOnApparelIcon()
                .clickOnShoesIcon()
                .clickOnNikeFloralIcon()
                .clickOnNikeFloralAddtocartButton();
        Assert.assertTrue(nikeflorapage.isErrorMessageDisplayed());
    }//end TC_addToCart_04()

    @Test(description = "veify Adding Item to the shopping cart with different  configurations when setting the configurations, the item is added to cart")
    public void TC_addToCart_05(){
        Utils.navigateTo(driver , ConfigUtliities.createInstance().getHomeURL());
        NikeFloralPage nikeflorapage = new HomePage(driver)
                .clickOnApparelIcon()
                .clickOnShoesIcon()
                .clickOnNikeFloralIcon();
        CartPage cartpage= nikeflorapage
               .setConfigurations()
               .clickOnNikeFloralAddtocartButton()
               .addtocartPageLinkClick();
        Assert.assertTrue(cartpage.isNikeFloralItemExisted());
    }//end TC_addToCart_05()

    @Test(description = "verify CHECKOUT _FUNC when user does a checkout with filling all the required data, checkout is done.")
    public void TC_addToCart_06()
    {
        new LoginPage(driver)
                .load()
                .login(User.getEmail(), User.getPassword());
        Utils.navigateTo(driver , ConfigUtliities.createInstance().getHomeURL());
        new HomePage(driver)
                .clickOnApparelIcon()
                .clickOnShoesIcon()
                .clickOnNikeFloralIcon();
        new NikeFloralPage(driver)
                .setConfigurations()
                .clickOnNikeFloralAddtocartButton()
                .addtocartPageLinkClick();
        new CartPage(driver)
                .termsofserviceCheckboxClick()
                .checkoutButtonClick();
        new BillingPage(driver).fillingBillingForm();
        new ShippingMethodPage(driver)
                .nextDayAirOptionClick()
                .continueButtonClick();
        new PaymentMethodPage(driver)
                .clickOnCreditCard().
                continueButtonClick();
        new PaymentInfoPage(driver).fillConfirmOrerForm();
        new ConfirmOrderPage(driver).clickOnConfirm();
        Assert.assertTrue(new CheckoutCompletedPage(driver).isSucessMessageDisplayed());
    }//end TC_addToCart_06()

    @Test(description = "verify Add to cart _FUNC when user adds an item from the wishlist items in the wishlist page, item is added to the cart")
    public void TC_addToCart_07() {
        Utils.navigateTo(driver , ConfigUtliities.createInstance().getHomeURL());
        WishListPage wishlistpage= new HomePage(driver)
                .jeweleryIconClick()
                .vintageRingIconClick()
                .clickOnAddToWishListButton()
                .wishlistPageLinkClick();
        CartPage cartPage=wishlistpage.clickOnvintageRingCheckbox().clickOnAddtocartButton();
        Assert.assertTrue(cartPage.isVintageRingExisted());
    }//end TC_addToCart_07()

}
