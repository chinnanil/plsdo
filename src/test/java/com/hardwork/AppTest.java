package com.hardwork;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.hardwork.base.BaseTest;
import com.hardwork.pages.CartPage;
import com.hardwork.pages.CheckoutPage;
import com.hardwork.pages.HomePage;
import com.hardwork.pages.StorePage;
import com.hardwork.utils.Address;
import com.hardwork.utils.JacksonUtils;
import com.hardwork.utils.Products;
import com.hardwork.utils.User;
import com.hardwork.utils.ConfigLoader;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest
{
    /**
     * Rigorous Test :-)
     * @throws IOException
     * @throws DatabindException
     * @throws StreamReadException
     */
    @Test
    public void checkoutDBT() throws StreamReadException, DatabindException, IOException
    {
     // Address address=new Address();
     Products product= new Products(123);
    
      Address address =JacksonUtils.deserializeJson("billingJson.json", Address.class);
           
           
        //    storePage.searchProduct();
           
        //  CartPage cartPage= storePage.addAndViewcart();
        //  CheckoutPage checkoutPage = cartPage.checkAndCheckout(product);
        //  checkoutPage.enterCountry("India");
         //Address address= new Address().setfName("anil").setlName("kumar").setStreetAddress("a.t.agraharam").setTownOrCity("guntur").setZipCode("522005").setEmailAddress("email@gmail.com");
       //  checkoutPage.enterFname("anil").enterLname("kumar").enterBillingAddress1("a.t.agraharam").enterBillingCity("guntur").enterBillingPcode("522004").enterBillingEmail("ee@ee.com");
      // checkoutPage.fillForm(address);
            }
            @Test
            public void loginAndcheckoutDBT() throws StreamReadException, DatabindException, IOException
            {
             // Address address=new Address();
             ConfigLoader conf=ConfigLoader.confSingleTon();
             User user=new User("anil","anilanil");
              Products product= new Products(123);
              Address address =JacksonUtils.deserializeJson("billingJson.json", Address.class);
                   HomePage homePage=new HomePage(getDriver());
                   StorePage storePage= homePage.clickStore();
                   storePage.checkStorePageLoaded().searchProduct();
                 CartPage cartPage= storePage.addAndViewcart();
                 CheckoutPage checkoutPage = cartPage.checkAndCheckout(product);
                 //Address address= new Address().setfName("anil").setlName("kumar").setStreetAddress("a.t.agraharam").setTownOrCity("guntur").setZipCode("522005").setEmailAddress("email@gmail.com");
               //  checkoutPage.enterFname("anil").enterLname("kumar").enterBillingAddress1("a.t.agraharam").enterBillingCity("guntur").enterBillingPcode("522004").enterBillingEmail("ee@ee.com");
                      }
}
