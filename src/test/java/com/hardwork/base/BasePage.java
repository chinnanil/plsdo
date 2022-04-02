package com.hardwork.base;

import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;
    protected BasePage(WebDriver driver){
        this.driver=driver;
    }
}
