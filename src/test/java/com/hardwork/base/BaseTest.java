package com.hardwork.base;

import com.google.j2objc.annotations.Property;
import com.hardwork.Factory.MydriverManager;

import javax.annotation.PropertyKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
   protected ThreadLocal<WebDriver> driver=new ThreadLocal<>();
   public void setDriver(WebDriver driver){
     this.driver.set(driver);
   }
   public WebDriver getDriver(){
     return this.driver.get();
   }
  @Parameters("browser")
  @BeforeMethod 
  public void startDriver(String browser){
   
        setDriver(new MydriverManager().initialiseDriver(browser));
     System.out.println("opened"+Thread.currentThread());
     
    }
    @AfterMethod
    public void quitDriver(){
     System.out.println("closed"+Thread.currentThread());

getDriver().quit();
      //  driver.quit();
    }

}
