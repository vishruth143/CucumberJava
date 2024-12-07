package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {
	
	@FindBy(xpath="//input[@id='username']")
	@CacheLookup
	WebElement username_txt;
	
	@FindBy(xpath="//input[@id='password']")
	@CacheLookup
	WebElement password_txt;
	
	@FindBy(xpath="//button[@id='submit']")
	@CacheLookup
	WebElement submit_btn;
	
	@FindBy(xpath="//a[normalize-space()='Log out']")
	@CacheLookup
	WebElement logout_btn;
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;		
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, this);
	}
	
	public void enterUsername(String username) {
		username_txt.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		password_txt.sendKeys(password);
	}
	
	public void clickSubmit() {
		submit_btn.click();
	}
	
	public boolean checkLogoutIsDisplayed() {
		return logout_btn.isDisplayed();
	}
	
	public void clickLogout() {
		logout_btn.click();
	}
}
