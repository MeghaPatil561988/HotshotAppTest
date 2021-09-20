package com.testcases;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
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


import Resources.base;
import pageObjects.Groups;

public class GroupsTC extends base
{
	public WebDriver driver;
	
	private static Logger log = LogManager.getLogger(DashBoardPage.class.getName());
	@BeforeTest
	public void initialize() throws IOException 
	{

		 driver=initializedriver();
		 log.info("driver is initialized");
		 driver.get(prop.getProperty("url"));
		 //log.info("navigated to Dashboard Page");
	}
	@Test
	public void navigatetogroups() throws Exception 
	{
		
		 Groups g = new Groups(driver);
		
		 String groupname ="My New Test Group1";
		 
		 g.getLoginLink("testuser3377@io.co.za","Password!@!@3377");
		 log.info("successfully navigated to landing page");
		 
		
		 
		 WebElement groupselement = driver.findElement(By.xpath("//a[@href='/customer/groups']"));
		 Actions action = new Actions(driver);
		 Thread.sleep(3000);
		 action.moveToElement(groupselement);
		 driver.findElement(By.xpath("//a[@href='/customer/groups']")).click();
		 
		 System.out.println("groups clicked");
		 
		
	  
	     g.getnewgroup().click();
		 System.out.println("newgroup clicked");
		 g.getgroupdetails().sendKeys(groupname);
		 g.getcontactdetails().sendKeys("my-new-test-group@io.co.za");
		 g.getcontinuebtn().click();
		 System.out.println("continuebtn clicked");
		 g.getdolater().click();
		 System.out.println("dolater clicked");
		 g.getselectportal().click();
		 System.out.println("selected portal");
		 Thread.sleep(3000);
		 
		 Actions actions = new Actions(driver);
		 actions.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'IO Digital')]"))).click().perform();
		 System.out.println("ioportal");
		 Thread.sleep(3000);
		 g.getfinish().click();
		 System.out.println("finish clicked");
		
		
		 List<String> rowelements = getRowElements(groupname);
		 Assert.assertTrue(rowelements.get(1).equals("0"));
		 System.out.println("verifying properties" +rowelements.get(1).equals("0"));
		 Assert.assertTrue(rowelements.get(2).equals("DRAFT"));
		 System.out.println("verifying status" +rowelements.get(2).equals("DRAFT"));
		 
	
		
	}    
		 private List<String> getRowElements(String group) 
		 {
			 WebElement row = driver.findElement(By.xpath("//tr[contains(normalize-space(),'My New Test Group1')]"));
			 List<WebElement> col =  row.findElements(By.tagName("td"));
			 List<String> colvalues = col.stream().map(element->element.getText()).collect(Collectors.toList());
			 System.out.println("printcolvalues"+colvalues);
			 return colvalues;
		 }
		 
		  
		 
	
	
	@AfterTest
    public void teardown() 
	{
    	driver.quit();
    }
	
}
