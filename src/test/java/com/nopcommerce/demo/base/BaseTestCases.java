package com.nopcommerce.demo.base;

import com.nopcommerce.demo.factory.DriverFactory;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Instant;

public class BaseTestCases {
    protected WebDriver driver;

    @BeforeMethod
    public void setup()
    {
        driver = new DriverFactory().initializeDriver();
    }
    @AfterMethod
    public void endSetup(ITestResult result) {
        String TCname = result.getMethod().getMethodName();
        File destFile = new File ("targets"+File.separator+"screenshos"+File.separator+TCname+".png");
        takeScreenshot(destFile);
        driver.quit();
    }
    public void takeScreenshot(File destFile){
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,destFile);
            Allure.addAttachment("screenshot", new FileInputStream(destFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
