package com.hardwork.pages;

import com.hardwork.base.BasePage;
import com.hardwork.utils.ElementUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage {

    By searchBox = By.id("woocommerce-product-search-field-0");
  By searchResult = By.xpath("//*[@id=\"main\"]/div/header/h1");
    public StorePage(WebDriver driver) {
            super(driver);
            elUtils=new ElementUtils(driver);
    }
    public StorePage checkStorePageLoaded(){
        wait.until(ExpectedConditions.urlContains("store"));
        return this;
    }
    public void searchProduct(){
        wait.until(ExpectedConditions.visibilityOf(elUtils.getElementByID(searchBox))).sendKeys("blue");
        elUtils.getElementByXpath(By.xpath("//*[@id=\"woocommerce_product_search-1\"]/form/button")).click();
    }
    public CartPage addAndViewcart(){
        wait.until(ExpectedConditions.textToBePresentInElementLocated(searchResult,"Search results: “blue”"));
        elUtils.getElementByXpath(By.xpath("//*[@id=\"main\"]/div/ul/li[1]/div[2]/a[2]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"main\"]/div/ul/li[1]/div[2]/a[3]"))).click();
        return new CartPage(driver);
    }

    
}
