package com.hardwork.pages;

import com.hardwork.base.BasePage;
import com.hardwork.utils.ElementUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
        elUtils=new ElementUtils(driver);
            }
    public StorePage clickStore(){
        elUtils.getElementByXpath(By.xpath("//li[@id=\"menu-item-1227\"]/a")).click();
        return new StorePage(driver);
    }  
           
      
}
