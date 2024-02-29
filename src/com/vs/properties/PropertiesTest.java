package com.vs.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
 
	public static void main(String[] args) throws IOException {
		
		// Collection with Property file
		FileInputStream fis= new FileInputStream("abc.properties");
		//load the property file
		Properties properties = new Properties();
		properties.load(fis);
		System.out.println("file loaded");
		
		//read the data from properties file
		
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
				
			
				
				
			

	}
}
