package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FrontSteps {
	WebDriver driver;
        @Given("User is on the login page")
		public void user_is_on_the_login_page() {
        	System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
    	    driver= new ChromeDriver();
    	    driver.get("http://demo.frontaccounting.eu/index.php");
		}
		@When("User entred username as {string} and password as {string} and click on login page")
		public void user_entred_username_as_and_password_as_and_click_on_login_page(String user, String pwd) {
		   driver.findElement(By.name("user_name_entry_field")).clear();
		   driver.findElement(By.name("user_name_entry_field")).sendKeys(user);
		   driver.findElement(By.name("password")).clear();
		   driver.findElement(By.name("password")).sendKeys(pwd);
		   driver.findElement(By.name("SubmitUser")).click();
		   
		}
		@Then("login {string} happens")
		public void login_happens(String string) {
		   if(driver.equals("Should")) {
			   if((driver.getTitle().equals("Main Menu"))) {
				   System.out.println("postitive test pass");
			   }
			   else {
				   System.out.println("postitive test fail");
				 //  Assert.fail("postitive test fail");
			   }
		   }
		   else {
			   if((driver.getTitle().equals("Main Menu"))){
				   System.out.println("Negative test pass");
			   }
			   else
			   {
				   System.out.println("Negative test pass");
				  // Assert.fail("Negative test pass");
			   }
		   }
		}
}