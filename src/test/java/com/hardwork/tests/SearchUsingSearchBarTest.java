package com.hardwork.tests;

import com.hardwork.base.BaseTest;
import com.hardwork.pages.StorePage;

import org.testng.annotations.Test;

public class SearchUsingSearchBarTest extends BaseTest{
    @Test
    public void searchWithKeywordAndCheckResult(){
        
StorePage storePageTest= new StorePage(getDriver());
storePageTest.load("/store");
storePageTest.searchProduct();
storePageTest.checkStorePageLoaded();
    }
    
}
