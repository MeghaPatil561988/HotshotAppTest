package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Properties
{
	WebDriver driver;
	By properties = By.xpath(" //a[contains(text(),'Properties')]");
	By newproperty = By.xpath("(//span[@class='q-focus-helper']/following-sibling::span)[2]");
	By propertyname = By.xpath("//input[@class='q-field__native q-placeholder']");
	
	public Properties(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public loginPage getLoginLink(String Username,String Password) 
	{
		loginPage lp = new loginPage(driver);
		 lp.getemail().sendKeys(Username);
		 lp.getpassword().sendKeys(Password);
		 lp.getlogin().click();
		 return lp;
	}
	
	public WebElement getproperties() 
	{
		return driver.findElement(properties);
	}
	
	public WebElement getnewproperty() 
	{
		return driver.findElement(newproperty);
	}
	public WebElement getpropertyname() 
	{
		return driver.findElement(propertyname);
	}
}
