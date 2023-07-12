package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchTest {

		WebDriver driver = null;
		
		@SuppressWarnings("deprecation")
		@Given("Browser is open")
		public void browser_is_open() {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("--Inside the function browser is open---");
		    String projectLocation = System.getProperty("user.dir");
		    System.out.println("Project Location: "+projectLocation);
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer Preoator\\eclipse-workspace\\SeleniumCucumberGherkin\\src\\test\\resources\\drivers\\chromedriver.exe");
			//System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		    driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		}

		@And("user is on google search page")
		public void user_is_on_google_search_page() throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			driver.navigate().to("https://www.google.com/");
			Thread.sleep(2000);
		    
		}

		@When("user enters a text in search box")
		public void user_enters_a_text_in_search_box() throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.name("q")).sendKeys("automation step by step");
			Thread.sleep(2000);
		    
		}

		@And("hits enter")
		public void hits_enter() throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
		}

		@Then("user is navigated to search box")
		public void user_is_navigated_to_search_box() {
		    // Write code here that turns the phrase above into concrete actions
		    driver.getPageSource().contains("Online Courses");
		    driver.close();
		    driver.quit();
		}




	

}
