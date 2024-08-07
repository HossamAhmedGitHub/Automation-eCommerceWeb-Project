package com.nopcommerce.demo.testcases;

import com.nopcommerce.demo.base.BaseTestCases;
import com.nopcommerce.demo.pages.SignupPage;
import com.nopcommerce.demo.utilities.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS1_SignUpTest extends BaseTestCases {

    @Test(description = "verify sign up _FUNC with validate input data, account must be created")
    public void TC_signup_01(){
        User.generateUser();
        boolean veifySignUp = new SignupPage(driver)
                .navigateToSignupPage()
                .signup(User.getFirstName(),User.getLastName(),User.getEmail(),User.getPassword(),User.getPassword())
                .clickOnRegisterButton()
                .verifySignup();
      Assert.assertTrue(veifySignUp);
    }
}
