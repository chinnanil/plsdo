package com.hardwork.pages;

import com.hardwork.base.BasePage;
import com.hardwork.utils.ElementUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
        
        driver.manage().window().maximize();
        elUtils=new ElementUtils(driver);
            }

            public void load(){
                load("/");
            }

    public StorePage clickStore(){
        System.out.println("store clicked");
       //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@id=\"menu-item-1227\"]/a"))).click();
        elUtils.getElementByXpath(By.xpath("//*[@id=\"menu-item-1227\"]/a")).click();
        return new StorePage(driver);
    }  
           
      
}
