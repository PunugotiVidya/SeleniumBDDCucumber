package com.learning.SeleniumProject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static Properties prop = new Properties();
	
	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		getBrowserConfig();
		setBrowserConfig();
		getBrowserConfig();
	

	}
	
	public static void getBrowserConfig() throws IOException {
		
		FileInputStream configFile = new FileInputStream("C:\\Users\\Acer Preoator\\eclipse-workspace\\SeleniumProject\\src\\test\\java\\config\\config.properties");
		prop.load(configFile);
		String browserKey = prop.getProperty("browser");
		FirstSeleniumProject.browser = prop.getProperty("browser");
		System.out.println("Value: "+browserKey);
	}
	
	public static void setBrowserConfig() throws IOException {
		FileOutputStream configFile = new FileOutputStream("C:\\Users\\Acer Preoator\\eclipse-workspace\\SeleniumProject\\src\\test\\java\\config\\config.properties");
		prop.setProperty("browser", "firefox");
		prop.setProperty("result", "pass");
		prop.store(configFile, "configurationFile");
		
	}

}
