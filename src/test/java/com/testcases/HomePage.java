package com.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.loginPage;

public class HomePage extends base {
	public WebDriver driver;
	base b=new base();
	private static Logger log = LogManager.getLogger(HomePage.class.getName());
	@BeforeTest
	public void initialize() throws IOException {

		 driver=initializedriver();
		// driver.get(prop.getProperty("url")); // it takes only one set of data
	}
	
	@Test(dataProvider="getdata")
	public void baseTestNavigation(String Username,String Password,String text) throws IOException, InterruptedException {
		 
		 driver.get(prop.getProperty("url")); 
		 
		 //Thread.sleep(2000);
		 //b.waitforAlret();
		 
	     loginPage lp = new loginPage(driver);
		 lp.getemail().sendKeys(Username);
		 lp.getpassword().sendKeys(Password);
		 //System.out.println(text);
		 log.info(text);
		 lp.getlogin().click();
	}
		 
		/* ForgotPassword fp= lp. getforgotpassword();
			fp.getEmail().sendKeys("xxx");
		}*/
		 
	
	
	@DataProvider
	public Object[][] getdata() 
	{
	   
       Object[][] data = new  Object[1][3];
      
       data[0][0] = "testuser3377@io.co.za";
       data[0][1] = "Password!@!@3377";
       data[0][2] = "Restricted User";
       
      /* data[1][0] = "testuser003377@io.co.za";
       data[1][1] ="Password!@!@003377";
       data[1][2] = "non Resricted User";*/
      
       return data;
    }
	
	 @AfterTest
	    public void teardown() {
	    	driver.quit();
	    }
}
