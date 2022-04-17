package com.hardwork.pages;

// import java.time.Duration;

import com.hardwork.base.BasePage;
import com.hardwork.utils.Address;
import com.hardwork.utils.User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage {

    // private Object executeScript;
protected CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage login(User user){
        driver.findElement(By.className("showlogin")).click();
        driver.findElement(By.id("username")).sendKeys(user.getUserName());
        driver.findElement(By.id("password")).sendKeys(user.getPassword());
        driver.findElement(By.xpath("//*[@id=\"post-1221\"]/div/div/div/div/form[1]/p[4]/button")).click();
        return this;
    }
    
    public void fillForm(Address address){
            this.enterFname(address.getfName()).enterLname(address.getlName()).enterCountry("India").
             enterBillingAddress1(address.getStreetAddress()).enterBillingCity(address.getTownOrCity()).
             enterBillingPcode(address.getZipCode()).enterBillingEmail(address.getEmailAddress()).placeOrder();
    }
 
    public CheckoutPage enterFname(String fName){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing_first_name"))).sendKeys(fName);    
        // driver.findElement(By.id("billing_first_name")).sendKeys(fName);;
            return this;
    }
    public CheckoutPage enterLname(String lName){
            driver.findElement(By.id("billing_last_name")).sendKeys(lName);;
            return this;
    }
    public CheckoutPage enterCountry(String lName){
        By countryByEle = By.className("select2-selection__arrow");
        wait.until(ExpectedConditions.elementToBeClickable(countryByEle)).click();
        // Select country= new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("billing_country"))));
        // country.selectByValue("India");
        // executeScript = ((JavascriptExecutor)driver).executeScript("alert(\"Hi\");");
        // country.selectByVisibleText("India");
        // //       xpath india ->  //*[@id="select2-billing_country-result-nuar-IN"]
        WebElement countryWedEle= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()=\"India\"]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",countryWedEle);
        countryWedEle.click();
        return this;
}
    public CheckoutPage enterBillingAddress1(String billingAddress1){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing_address_1"))).sendKeys(billingAddress1);   
        // driver.findElement().sendKeys(billingAddress1);;
            return this;
    }
    public CheckoutPage enterBillingCity(String billingCity){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing_city"))).sendKeys(billingCity);    

        //     driver.findElement(By.id("billing_city")).sendKeys(billingCity);
            return this;
    }
    public CheckoutPage enterBillingPcode(String billingPcode){
            driver.findElement(By.id("billing_postcode")).sendKeys(billingPcode);
            return this;
    }
    public CheckoutPage enterBillingEmail(String billingEmail){
            driver.findElement(By.id("billing_email")).sendKeys(billingEmail);
            return this;
    }
    public void placeOrder(){
        driver.findElement(By.id("place_order")).click();
        
}
}
