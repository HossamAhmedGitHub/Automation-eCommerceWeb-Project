package com.nopcommerce.demo.testcases;

import com.nopcommerce.demo.base.BaseTestCases;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;

import static com.nopcommerce.demo.utilities.ConfigUtliities.createInstance;

import com.nopcommerce.demo.utilities.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTestCases {

    @Test(description = "verify login _FUNC with valid email and password")
    public void TC_addToCart_00()
    {
        LoginPage loginObject = new LoginPage(driver);
        boolean status = loginObject
                .load()
                .login(User.getEmail(), User.getPassword())
                .loginVerification();
        Assert.assertTrue(status);
    }//end TC_addToCart_00()


}
