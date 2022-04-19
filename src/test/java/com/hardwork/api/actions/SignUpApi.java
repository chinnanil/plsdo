package com.hardwork.api.actions;

// import io.restassured.RestAssured;
import io.restassured.http.Cookies;
import io.restassured.response.Response;

 import static io.restassured.RestAssured.given;
// import static io.restassured.RestAssured.*;
// import static io.restassured.matcher.RestAssuredMatchers.*;
// import static org.hamcrest.Matchers.*;
import com.hardwork.utils.ConfigLoader;

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
    }

