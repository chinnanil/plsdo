package com.hardwork.api.actions;

// import io.restassured.RestAssured;
import io.restassured.http.Cookies;
import io.restassured.response.Response;

 import static io.restassured.RestAssured.given;
// import static io.restassured.RestAssured.*;
// import static io.restassured.matcher.RestAssuredMatchers.*;
// import static org.hamcrest.Matchers.*;
import com.hardwork.utils.ConfigLoader;


public class SignUpApi {
        private Cookies cookies;

        public Cookies getCookies(){
            return cookies;
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

