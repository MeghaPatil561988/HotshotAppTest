package pageObjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Dashboard {
	WebDriver driver;
	By todaytitle = By.xpath("//h2[contains(text(),'Today')]");
	By ActivePropertiescomp = By.xpath("//span[contains(text(),'Active Properties')]");
	By ActiveInternetUserscomp = By.xpath("//span[contains(text(),'Active Internet Users')]");
	By GBUsagecomp = By.xpath("//span[contains(text(),'GB Usage')]");
	By overviewtitle = By.xpath("//h2[contains(text(),'Overview')]");
    By propertytypedropdown = By.xpath("//i[contains(@class,'q-select__dropdown-icon material-icons')]");
   
    @FindBy(xpath="//div[@class='q-item__label']")
    private List<WebElement> propertytypevalues;
    
    By totalofAccountsActivated = By.xpath("//div[contains(text(),'Total # of Accounts Activated')]");
    By totalofdevices = By.xpath("//div[contains(text(),'Total # of Devices')]");
    By gbUsageTitle = By.xpath("//div[contains(text(),'GB Usage Total')]");
   
    
   
	
	public Dashboard(WebDriver driver) 
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
	public WebElement getTitle() 
	{
		return driver.findElement(todaytitle);
	}
	public WebElement getOverviewTitle() 
	{
		return driver.findElement(overviewtitle);
	}
	public WebElement getActivePropertiescomp() 
	{
		return driver.findElement(ActivePropertiescomp);
	}
	public WebElement getActiveInternetUserscomp() 
	{
		return driver.findElement(ActiveInternetUserscomp);
	}
	public WebElement getGBUsagecomp() 
	{
		return driver.findElement(GBUsagecomp);
	}
	
	public WebElement getpropertytype() 
	{
		return driver.findElement(propertytypedropdown);
	}
	public List<WebElement> getpropertytypevalues()
	    {
	    	return propertytypevalues;
	    }
	public WebElement totalofAccountsActivated() 
	{
		return driver.findElement( totalofAccountsActivated);
	}
	public WebElement totalofdevices() 
	{
		return driver.findElement(totalofdevices);
	}
	public WebElement gbUsageTitle() 
	{
		return driver.findElement(gbUsageTitle);
	}
}
