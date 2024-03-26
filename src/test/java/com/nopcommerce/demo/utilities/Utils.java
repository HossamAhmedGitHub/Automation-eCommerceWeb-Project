package com.nopcommerce.demo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Utils {
    public static void navigateTo(WebDriver driver , String URL){
        driver.get(URL);
    }
    public static void reoloadPage(WebDriver driver){
        driver.navigate().refresh();
    }
    public static boolean isElementExist(WebDriver driver, By element){
        List<WebElement> elements = driver.findElements(element);
        if (elements.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void scrollToElement(WebDriver driver, WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public static void scrollDownByPixels(WebDriver driver,int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")");
    }

}
