package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemoSteps {
	
//	WebDriver driver = null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside step - browser is open");
//		String projectPath=System.getProperty("user.dir");
//		System.out.println("Project path is: "+projectPath);
//		
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		
//		driver.manage().window().maximize();	    
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		System.out.println("Inside step - user is on login page");
//		driver.get("https://practicetestautomation.com/practice-test-login/");	    
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String userName, String password) {
//		System.out.println("Inside step - user enters username and password");
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//	}
//	
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//		System.out.println("Inside step - user clisck on login");
//		driver.findElement(By.xpath("//button[@id='submit']")).click();
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//		System.out.println("Inside step - user is navigated to the home page");
//		String text = driver.findElement(By.xpath("//h1[normalize-space()='Logged In Successfully']")).getText();
//		System.out.println(text);	
//		driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
//		
//		driver.close();
//		driver.quit();
//	}	
}
