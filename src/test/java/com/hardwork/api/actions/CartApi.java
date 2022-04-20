package com.hardwork.api.actions;

import java.util.HashMap;

import com.github.dockerjava.transport.DockerHttpClient.Response;
import com.hardwork.utils.ConfigLoader;

import io.restassured.http.Cookies;
import io.restassured.http.Headers;
import static io.restassured.RestAssured.given;


/**
 * CartApi
 */
public class CartApi {
   
    private Cookies cookies;
   public CartApi(){}
   public CartApi(Cookies cookies){
       this.cookies=cookies;
   }
    public Cookies getCookies(){
        return cookies;
    }
    public io.restassured.response.Response addToCart(){
        io.restassured.http.Header header= new io.restassured.http.Header("Content-Type" , "application/x-www-form-urlencoded");
        Headers headers =  new Headers(header);
        HashMap<String,String> formParams = new HashMap<>();
       
        formParams.put("uproduct_sku","") ;
        formParams.put("product_id","1215") ;
        formParams.put("quantity","1") ;
     if(cookies==null){
         cookies=new Cookies();
     }
        io.restassured.response.Response response = 
        given().
            baseUri(ConfigLoader.confSingleTon().getBaseUrl()).cookies(cookies).log().all().headers(headers).formParams(formParams).
        when().
            post("/?wc-ajax=add_to_cart").
        then().
            log().all() .extract().response();
        if(response.getStatusCode()!=302){
            throw new RuntimeException("status code wrong");
        }
        this.cookies=response.getDetailedCookies();
        return response;
    }

    
}