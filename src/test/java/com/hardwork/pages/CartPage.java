package com.hardwork.pages;

import com.hardwork.base.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver){
        super(driver);
    }
    public CheckoutPage checkAndCheckout(){
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/form/table/tbody/tr[1]/td[3]/a"), "Blue Shoes"));
        driver.findElement(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();
        return new CheckoutPage(driver);
    }
}
