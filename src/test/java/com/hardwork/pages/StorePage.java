package com.hardwork.pages;

import com.hardwork.base.BasePage;
import com.hardwork.utils.ElementUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage {

    By searchBox = By.id("woocommerce-product-search-field-0");
  By searchResult = By.xpath("woocommerce-products-header__title page-title");
    public StorePage(WebDriver driver) {
            super(driver);
            elUtils=new ElementUtils(driver);
    }
    public void searchProduct(){
        wait.until(ExpectedConditions.visibilityOf(elUtils.getElementByID(searchBox))).sendKeys("blue");
        elUtils.getElementByXpath(By.xpath("//*[@id=\"woocommerce_product_search-1\"]/form/button")).click();
    }
    public void addAndViewcart(){
        wait.until(ExpectedConditions.visibilityOf(elUtils.getElementByClassName(searchResult)));
        elUtils.getElementByXpath(By.xpath("//*[@id=\"main\"]/div/ul/li[1]/div[2]/a[2]")).click();
    }

    
}
