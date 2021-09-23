package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SeleniumDevSteps {
	WebDriver driver;
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	    driver= new ChromeDriver();
	}
	@After
	public void after() throws Exception{
		Thread.sleep(2000);
		driver.quit();
	}
	@Given("User is on Home Page of Selenium")
	public void user_is_on_home_page_of_selenium() {
	    //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	   // driver= new ChromeDriver();
	    driver.get("http://selenium.dev");
	
	}

	@When("user clicks on Download link")
	public void user_clicks_on_download_link() {
	   driver.findElement(By.linkText("Downloads")).click();
	   
	}
	

	@Then("title should be {string}")
	public void title_should_be(String expectedTitle) {
	    Assert.assertEquals(expectedTitle, driver.getTitle());
	}


}