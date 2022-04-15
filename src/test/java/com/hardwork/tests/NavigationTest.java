package com.hardwork.tests;

import com.hardwork.base.BaseTest;
import com.hardwork.pages.StorePage;
import com.hardwork.pages.HomePage;

import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {
    @Test
    public void navigateFromHomeToStoreUsingManiMenu(){
        StorePage storePage= new HomePage(getDriver(),confDotProp.getBaseUrl()).clickStore();
           storePage.checkStorePageLoaded();
    }
    
}
