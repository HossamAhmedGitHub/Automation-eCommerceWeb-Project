package com.nopcommerce.demo.testcases;

import com.nopcommerce.demo.base.BaseTestCases;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.utilities.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS2_LoginTest extends BaseTestCases {

    @Test(description = "verify login _FUNC with valid email and password")
    public void TC_login_01()
    {
        boolean status = new LoginPage(driver)
                .load()
                .login(User.getEmail(), User.getPassword())
                .loginVerification();
        Assert.assertTrue(status);
    }//end TC_addToCart_00()


}
