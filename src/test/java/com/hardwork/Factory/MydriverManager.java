package com.hardwork.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

enum DriverType{
    CHROME,
    FIREFOX
}

public class MydriverManager {

    public WebDriver initialiseDriver(String browser) {
        WebDriver driver=null;        
        String localBrowser;
        localBrowser = System.getProperty("browser",browser);
       // localBrowser=browser;
        switch (DriverType.valueOf(localBrowser)) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
                default:
                      throw new IllegalStateException("invalid  browser") ;
                        

        }
        return driver;
    }
}
