package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksDemoSteps {
	
	WebDriver driver = null;
	
	@Before(value="@smoke", order=1)
	public void browserSetup() {
		System.out.println("Inside browser setup");
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@After(order=1)
	public void teardown() {
		System.out.println("Inside teardown");
		driver.quit();
	}
	
	@After(order=2)
	public void testdown2() {
		System.out.println("Inside teardown2");
	}
	
	@BeforeStep
	public void beforeSteps() {
		System.out.println("Inside before steps");
	}
	
	@AfterStep
	public void afterSteps() {
		System.out.println("Inside after steps");
	}
	
	@Before(order=0)
	public void setup2() {
		System.out.println("Inside steup2");
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	   
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	   
	}
}
