package com.nopcommerce.demo.testcases;

import com.nopcommerce.demo.base.BaseTestCases;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.utilities.ConfigUtliities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTestCases {
    private String validMail = "ha304389@gmail.com";
    private String invalidMail = "ka84@gmail.com";
    private String validPassword = "pass1234";
    private String invalidPassword = "bv1244";
    @Test
    public void TC_addToCart_00()
    {
        LoginPage loginObject = new LoginPage(driver);
        boolean status = loginObject
                .load()
                .login(ConfigUtliities.createInstance().getEmail(), ConfigUtliities.createInstance().getPassword())
                .loginVerification();
        Assert.assertTrue(status);
    }//end TC_addToCart_00()


}
