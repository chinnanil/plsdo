package com.hardwork.utils;

import java.util.Properties;

// import org.apache.commons.lang3.ObjectUtils.Null;

public class ConfigLoader {
    private final Properties properties;
    private static ConfigLoader confLoader;
    private ConfigLoader(){
      properties=PropertyUtils.propertyLoader("src/test/resources/config.properties");
    }
    public static  ConfigLoader confSingleTon(){
            if(confLoader==null){
                confLoader= new ConfigLoader();
            }
            return confLoader;
    }
    public String getBaseUrl(){
        String url= properties.getProperty("baseURL");
        if(url!=null) 
        {
          return url;
    }
    else throw new RuntimeException();
    }
    public String getUserName(){
        String username= properties.getProperty("username");
        if(username!=null) 
        {
          return username;
    }
    else throw new RuntimeException();
    }
    public String getPassword(){
        String password= properties.getProperty("password");
        if(password!=null) 
        {
          return password;
    }
    else throw new RuntimeException();
    }
}
