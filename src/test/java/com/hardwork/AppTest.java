package com.hardwork;

import com.hardwork.base.BaseTest;
import com.hardwork.pages.CartPage;
import com.hardwork.pages.CheckoutPage;
import com.hardwork.pages.HomePage;
import com.hardwork.pages.StorePage;
import com.hardwork.utils.Address;

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
         CheckoutPage checkoutPage = cartPage.checkAndCheckout();
         Address address= new Address().setfName("anil").setlName("kumar").setStreetAddress("a.t.agraharam").setTownOrCity("guntur").setZipCode("522005").setEmailAddress("email@gmail.com");
       //  checkoutPage.enterFname("anil").enterLname("kumar").enterBillingAddress1("a.t.agraharam").enterBillingCity("guntur").enterBillingPcode("522004").enterBillingEmail("ee@ee.com");
       checkoutPage.fillForm(address);
            }
}
