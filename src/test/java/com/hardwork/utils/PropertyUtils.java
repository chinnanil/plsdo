package com.hardwork.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
public static Properties propertyLoader(String filepath) {
	Properties properties = new properties();
	BufferedReader reader;
	try {
		reader=new BufferedReader(new FileReader(filePath));
		try {
			properties.load(reader);
			reader.close();
			}catch(IOException e) {
				e.printStackTrace();
				throw new RuntimeException("failed to load properties file"+filePath);
			}	
			}catch(FileNotFoundException e) {
				e.printStackTrace();
				throw new RuntimeException("properties file not found at"+filePath);
			}
	
	
	return properties;
}
}

