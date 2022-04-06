package com.hardwork;

import com.hardwork.base.BaseTest;
import com.hardwork.pages.CartPage;
import com.hardwork.pages.HomePage;
import com.hardwork.pages.StorePage;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void checkoutDBT()
    {
           HomePage homePage=new HomePage(driver);
           StorePage storePage= homePage.clickStore();
           storePage.searchProduct();
         CartPage cartPage= storePage.addAndViewcart();
         cartPage.checkAndCheckout();
            }
}
