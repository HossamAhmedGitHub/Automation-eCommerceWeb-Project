package com.nopcommerce.demo.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DriverFactory {
    private WebDriver driver;

    public WebDriver initializeDriver()
    {
        String browser = System.getProperty("browser","chrome");
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case"edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case"safari":
                driver = new SafariDriver();
                break;
            case"firfox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("error in entered browser type");
        }//end switch()
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global implicit
        return driver;
    }
}
