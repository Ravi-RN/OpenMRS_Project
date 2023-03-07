package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	Properties pro;
	
	public ConfigurationReader() throws IOException {
		
		File f = new File("C:\\Users\\J.P.Ravi\\eclipse-workspace\\OpenMRS_Project\\src\\test\\java\\com\\helper\\openmrs.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		pro = new Properties();
		
		pro.load(fis);
	}
	
	public String browser() {
		
		String browser = pro.getProperty("browser");
		
		return browser;

	}
	
	public String url() {
		
		String url = pro.getProperty("url");
		
		return url;
		

	}

}
