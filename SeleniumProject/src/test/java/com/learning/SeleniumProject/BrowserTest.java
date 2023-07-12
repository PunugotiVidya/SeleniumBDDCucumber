package com.learning.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
//		WebDriverManager.chromedriver().setup(); // manages the driver configurations
		
		String projectLocation = System.getProperty("user.dir");
		System.out.println(projectLocation);
		System.setProperty("webdriver.gecko.driver", projectLocation+"/lib/geckodriver/geckodriver.exe");
		//System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.tutorialspoint.com/");
		driver.close();
		
		 
	}
}
