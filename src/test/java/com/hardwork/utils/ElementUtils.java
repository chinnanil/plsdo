package com.hardwork.utils;

import com.hardwork.base.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
WebDriver driver;
    public ElementUtils(WebDriver driver) {
        this.driver=driver;
           }
           public void testElUtils(){
               System.out.println("testElUtils");
           }
    public WebElement getElementByID(By id){
            return driver.findElement(id);
    }
    public WebElement getElementByClassName(By className){
        return driver.findElement(className);
}
public WebElement getElementByCssSelector(By cssSelector){
    return driver.findElement(cssSelector);
}
public WebElement getElementByLinkText(By byLinkText ){
    return driver.findElement(byLinkText);
}
    
public WebElement getElementByName(By name ){
    return driver.findElement(name);
}

public WebElement getElementByTagName(By tagName ){
    return driver.findElement(tagName);
}

public WebElement getElementByXpath(By xPath ){
    return driver.findElement(xPath);
}
}
