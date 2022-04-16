package com.hardwork.tests;

import com.hardwork.base.BaseTest;
import com.hardwork.pages.StorePage;
import com.hardwork.utils.ConfigLoader;
import com.hardwork.pages.HomePage;

import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {
    @Test
    public void navigateFromHomeToStoreUsingManiMenu(){
       System.out.println("************************"+ConfigLoader.confSingleTon().getBaseUrl());
        StorePage storePage= new HomePage(getDriver()).clickStore();
           storePage.checkStorePageLoaded();
    }
    
}
