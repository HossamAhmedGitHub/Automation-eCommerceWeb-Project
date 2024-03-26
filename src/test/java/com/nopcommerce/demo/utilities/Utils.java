package com.nopcommerce.demo.utilities;

import org.openqa.selenium.WebDriver;

public class Utils {
    public static void navigateTo(WebDriver driver , String URL){
        driver.get(URL);
    }
    public static void reoloadPage(WebDriver driver){
        driver.navigate().refresh();
    }

}
