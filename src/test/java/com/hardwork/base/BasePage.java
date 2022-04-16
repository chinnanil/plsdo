package com.hardwork.base;

import java.time.Duration;

import com.github.dockerjava.api.model.Endpoint;
import com.hardwork.utils.ConfigLoader;
import com.hardwork.utils.ElementUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait ;
    protected ElementUtils elUtils;
    protected BasePage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(this.driver,Duration.ofMillis(15000));
    }
    public void load(String endPoint){
            driver.get(ConfigLoader.confSingleTon().getBaseUrl()+endPoint);
    }
  
}
