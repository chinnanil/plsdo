package com.hardwork.api.actions;

// import io.restassured.RestAssured;
import io.restassured.http.Cookies;
import io.restassured.http.Headers;
import io.restassured.response.Response;

 import static io.restassured.RestAssured.given;

import java.util.HashMap;

// import static io.restassured.RestAssured.*;
// import static io.restassured.matcher.RestAssuredMatchers.*;
// import static org.hamcrest.Matchers.*;
import com.hardwork.utils.ConfigLoader;

import org.apache.http.entity.mime.Header;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.json.Json;


public class SignUpApi {
        private Cookies cookies;

        public Cookies getCookies(){
            return cookies;
        }

public String fetchRegisterNonceValue(){
Response response=getAccount();
return response.htmlPath().getString("**.findAll {it.@name == 'woocommerce-register-nonce' }.@value");
}
public String fetchRegisterNonceValueUsingJsoup(){
    Response response=getAccount();
    Document doc=Jsoup.parse(response.htmlPath().prettyPrint());
    Element ele= doc.selectFirst("#woocommerce-register-nonce");
    return ele.attr("value");
}

        public Response getAccount(){
            System.out.println("in get account");
            Cookies cookies=new Cookies();
            Response response = given().baseUri(ConfigLoader.confSingleTon().getBaseUrl()).cookies(cookies).log().all().when().get("/account").then().log().all() .extract().response();
            if(response.getStatusCode()!=200){
                throw new RuntimeException("status code wrong");
            }
            
            return response;
        }
        public Response register(){
            Cookies cookies=new Cookies();
            io.restassured.http.Header header= new io.restassured.http.Header("Content-Type" , "application/x-www-form-urlencoded");
            Headers headers =  new Headers(header);
            HashMap<String,String> formParams = new HashMap<>();
           
            formParams.put("username","jjhjjjkjjhjhh") ;
            formParams.put("email","hjhjhjjjh@hjhj.com") ;
            formParams.put("password","jkjjjkjkj") ;
            formParams.put("woocommerce-register-nonce",fetchRegisterNonceValue()) ;
            formParams.put("_wp_http_referer","/account/") ;
            formParams.put("register","Register") ;
            Response response = 
            given().
                baseUri(ConfigLoader.confSingleTon().getBaseUrl()).cookies(cookies).log().all().headers(headers).formParams(formParams).
            when().
                post("/account").
            then().
                log().all() .extract().response();
            if(response.getStatusCode()!=302){
                throw new RuntimeException("status code wrong");
            }
            this.cookies=response.getDetailedCookies();
            return response;
        }
    }

