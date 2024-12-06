package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	protected WebDriver driver;
	
	private By username_txt = By.xpath("//input[@id='username']");
	private By password_txt = By.xpath("//input[@id='password']");
	private By login_btn = By.xpath("//button[@id='submit']");
	private By logout_btn = By.xpath("//a[normalize-space()='Log out']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}	
	
	public void enterUsername(String username) {
		driver.findElement(username_txt).sendKeys(username);		
	}
	
	public void enterPassowrd(String password) {
		driver.findElement(password_txt).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(login_btn).click();
	}
	
	public void clickLogout() {
		driver.findElement(logout_btn).click();
	}
	
	public boolean checkLogoutIsDisplayed() {
		return driver.findElement(logout_btn).isDisplayed();
	}
	
	public void loginValidUser(String username, String password) {
		driver.findElement(username_txt).sendKeys(username);
		driver.findElement(password_txt).sendKeys(password);
		driver.findElement(login_btn).click();
	}
			

}
