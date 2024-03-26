package com.nopcommerce.demo.utilities;

import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Screenshot {
    public static void takeScreenshot(File destFile, WebDriver driver){
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,destFile);
            Allure.addAttachment("screenshot", new FileInputStream(destFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
