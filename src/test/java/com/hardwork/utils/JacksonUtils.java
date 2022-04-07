package com.hardwork.utils;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonUtils {
    public static Address deserializeJson(InputStream is, Address address) throws StreamReadException, DatabindException, IOException{
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(is, address.getClass());

            
    }
}
