package com.hardwork.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

public class Products {
    private int id;
    private String productName;
    public Products(){

    }
    
    public Products(int id,String productName){
        this.id=id;
        this.productName=productName;
    }
    public Products(int id) throws StreamReadException, DatabindException, IOException {
        System.out.println("in product cont");

        Products[] products=JacksonUtils.deserializeJson("products.json", Products[].class);
     for(Products prod:products){
         if(prod.id==id){
             this.id=prod.id;
             this.productName=prod.productName;
         }
     }

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
   
}
