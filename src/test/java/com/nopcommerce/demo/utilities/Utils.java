package com.nopcommerce.demo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static com.nopcommerce.demo.utilities.DataUtils.getConfigValue;
import static com.nopcommerce.demo.utilities.WaitsUtils.generalWait;

public class Utils {
    public static void navigateTo(WebDriver driver, String URL) {
        driver.get(URL);
    }

    public static void reoloadPage(WebDriver driver) {
        driver.navigate().refresh();
    }

    public static boolean isElementExist(WebDriver driver, By element) {
        List<WebElement> elements = driver.findElements(element);
        if (elements.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void scrollToElement(WebDriver driver, By by) {
        WebElement element = Utils.findWebElement(driver,by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownByPixels(WebDriver driver, int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")");
    }

    public static WebElement findWebElement(WebDriver driver, By locator) {
        return driver.findElement(locator);
    }

    //TODO: Clicking on element after checking clickability
    public static void clicking(WebDriver driver, By locator) {
        WaitsUtils.explicitlyWaitForClickability(driver, locator);
        findWebElement(driver, locator).click();
    }

    //TODO: Send data to element after checking visibility
    public static void sendData(WebDriver driver, By locator, String data) {
        WaitsUtils.explicitlyWaitForVisibility(driver, locator);
        findWebElement(driver, locator).sendKeys(data);
    }

    public static boolean verifyElementVisible(WebDriver driver, By by) {
        try {
            WaitsUtils.explicitlyWaitForVisibility(driver, by);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static void tearDown(WebDriver driver){
        driver.quit();
    }
}
