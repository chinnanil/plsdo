package com.hardwork.utils;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonUtils {
    public static <T> T deserializeJson(String  fileName, Class<T> T) throws StreamReadException, DatabindException, IOException{
        InputStream is= JacksonUtils.class.getClassLoader().getResourceAsStream(fileName);
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(is, T);

            
    }
}
