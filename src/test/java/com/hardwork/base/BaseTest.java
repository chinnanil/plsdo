package com.hardwork.base;

import com.hardwork.Factory.MydriverManager;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
   protected WebDriver driver;
    @BeforeMethod 
    public void startDriver(){
        driver=new MydriverManager().initialiseDriver("firefox");
        driver.get("http://askomdch.com"); 
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void quitDriver(){
      //  driver.quit();
    }

}
