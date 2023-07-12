package com.learning.SeleniumProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumProject {

	static WebDriver driver;
	static String browser;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		setDriver();
		PropertyFile.getBrowserConfig();
		setDriverConfig();
		PropertyFile.setBrowserConfig();

	}
	
	public static void setDriver() {
//		browser = "chrome";
	}
	
	public static void setDriverConfig() {
		
		if(browser.toString().contains("chrome")) {
			 driver = new ChromeDriver();
			 driver.get("https://www.tutorialspoint.com/");
			 driver.close();
		}
		else if(browser.toString().contains("firefox")) {
			 driver = new FirefoxDriver();
			 driver.get("https://www.tutorialspoint.com/");
			 driver.close();
		}
	}

}
