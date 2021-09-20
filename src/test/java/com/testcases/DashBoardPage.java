package com.testcases;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;


import Resources.base;
import pageObjects.Dashboard;

public class DashBoardPage extends base
{
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(DashBoardPage.class.getName());
	@BeforeTest
	public void initialize() throws IOException {

		 driver=initializedriver();
		 log.info("driver is initialized");
		 driver.get(prop.getProperty("url"));
		 log.info("navigated to Dashboard Page");
	}
	@Test
	public void navigatetodashboard() throws IOException, InterruptedException
    {
		 Dashboard d = new Dashboard(driver);
		
		 
		 d.getLoginLink("testuser3377@io.co.za","Password!@!@3377");
		 log.info("successfully navigated to dashboard page");
		 
		 
		/* WebElement dashboardselement = driver.findElement(By.xpath("//a[@class='dash-menu-item']"));
		 Actions action = new Actions(driver);
		 Thread.sleep(3000);
		 action.moveToElement(dashboardselement);
		 driver.findElement(By.xpath("//a[@class='dash-menu-item']")).click();*/
		 
		 //System.out.println("dashboard clicked");
		 
		 
		 Assert.assertEquals(d.getTitle().getText(),"Today");
		 System.out.println(d.getTitle().getText());
		 System.out.println("successfully validated Today subtitle");
		 
		 Assert.assertTrue(d.getActivePropertiescomp().isDisplayed());
		 System.out.println(d.getActivePropertiescomp().getText());
		 
		 //Assert.assertFalse(false);
		 
		 Assert.assertTrue(d.getActiveInternetUserscomp().isDisplayed());
		 System.out.println(d.getActiveInternetUserscomp().getText());
		 
		 Assert.assertTrue(d.getGBUsagecomp().isDisplayed());
		 System.out.println(d.getGBUsagecomp().getText());
		 
		 Assert.assertEquals(d.getOverviewTitle().getText(),"Overview");
		 System.out.println(d.getOverviewTitle().getText());
		 System.out.println("successfully validated Overview subtitle");
		 
		
		 selectAndVerifyPropertytType("Hotel");
		 selectAndVerifyPropertytType("Student Accommodation");
		 selectAndVerifyPropertytType("Residential");
		    
    }      
		 
	private void selectAndVerifyPropertytType(String property) throws InterruptedException 
	{
		 Dashboard d = new Dashboard(driver);
		 SoftAssert a = new SoftAssert();
		WebElement dropdownelement=d.getpropertytype();
		dropdownelement.click();
		List<WebElement> listt =  driver.findElements(By.xpath("//div[@class='q-item__label']"));
		List<String> list1 = listt.stream().map(element->element.getText()).collect(Collectors.toList());
		
		System.out.println(""+list1);
		 a.assertTrue(list1.containsAll(List.of("Hotel","Student Accommodation","Residential"))); 
		 
		Thread.sleep(3000);
		 WebElement e = driver.findElement(By.xpath("//div[contains(text(),'"+property+"')]"));
		 Actions act = new Actions(driver);
		 act.moveToElement(e).click().perform();
		 System.out.println("gettext");
		 
		//div[@class='overview-title']
		 List<WebElement> listt1 = driver.findElements(By.xpath("//div[@class='overview-title']"));
		 List<String> list2 = listt1.stream().map(element->element.getText()).collect(Collectors.toList());
		 System.out.println(""+list2);
		 a.assertTrue(list2.containsAll(List.of("Total # of Accounts Activated","Total # of Devices","GB Usage Total"))); 
		 Thread.sleep(2000);
         
		 
		 
	}
	
	@AfterTest
    public void teardown() {
    	driver.quit();
    }
    
	
}
