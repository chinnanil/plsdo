package com.hardwork.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MydriverManager {
    public WebDriver initialiseDriver(){
        return new ChromeDriver();
    }
}
