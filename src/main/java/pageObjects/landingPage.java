package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
WebDriver driver;
//By signin = By.xpath("");
By logout = By.cssSelector("a[href*='sign_in']");


public landingPage(WebDriver driver) 
{
	this.driver=driver;
}



public loginPage getLogoutLink() {
	
	 driver.findElement(logout).click();
	 loginPage lp = new loginPage(driver);
	 return lp;
}


/*public WebElement getNavigationBar() {
	return driver.findElement(navbar);
}*/


}
