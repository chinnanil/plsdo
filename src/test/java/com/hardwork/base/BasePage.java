package com.hardwork.base;

import com.hardwork.utils.ElementUtils;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;
    protected ElementUtils elUtils;
    protected BasePage(WebDriver driver){
        this.driver=driver;
    }
  
}
