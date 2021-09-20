package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Groups
{
	WebDriver driver;
	By groups = By.xpath("(//a[contains(text(),'Groups')]/@href");
	By newgroup = By.xpath("//span[contains(text(),'+ New Group')]");
	By groupdetails = By.xpath("//input[@data-cy='name']");
	By contactdetails = By.xpath("(//span[text()='3']/following::input)[2]");
	By continuebtn = By.xpath("//span[text()='Continue']");
	By dolater = By.xpath("//span[contains(text(),\"I'll do this later\")]");
	By selectportal = By.xpath("//i[contains(@class,'q-select__dropdown-icon material-icons')]");
	By iodigital = By.xpath("//div[contains(text(),'IO Digital')]");
	By finish = By.xpath("//span[contains(text(),'Finish')]");
	By rowvalues = By.xpath("//table[@class='q-table']");
	
	public Groups(WebDriver driver) 
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
	
	public WebElement getgroup() 
	{
		return driver.findElement(groups);
	}
	
	public WebElement getnewgroup() 
	{
		return driver.findElement(newgroup);
	}
	public WebElement getgroupdetails() 
	{
		return driver.findElement(groupdetails);
	}
	public WebElement getcontactdetails() 
	{
		return driver.findElement(contactdetails);
	}
	public WebElement getcontinuebtn() 
	{
		return driver.findElement(continuebtn);
	}
	public WebElement getdolater() 
	{
		return driver.findElement(dolater);
	}
	public WebElement getselectportal() 
	{
		return driver.findElement(selectportal);
	}
	public WebElement getioportal() 
	{
		return driver.findElement(iodigital);
	}
	public WebElement getfinish() 
	{
		return driver.findElement(finish);
	}
	public WebElement getrowvalues() 
	{
		return driver.findElement(rowvalues);
	}
}
