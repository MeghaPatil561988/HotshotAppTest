package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	WebDriver driver;

	
	By email = By.xpath("//input[@type='text']");
	By password = By.xpath("//input[@type='password']");
	By login = By.cssSelector("span[class='block']");
	//By forgotPassword = By.cssSelector("[href*='password/new']");
	
	
	public loginPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public WebElement getemail()
	{
		
		return driver.findElement(email);
	}
	
	public WebElement getpassword() 
	{
		return driver.findElement(password);
	}
	
	public WebElement getlogin() 
	{
		return driver.findElement(login);
	}
	
	/*public ForgotPassword getforgotpassword()
	{
		driver.findElement(forgotPassword).click();
		return new ForgotPassword(driver);
	}*/
	
	
	
	
	
	
}
