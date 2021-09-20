package com.testcases;

import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.base;
import pageObjects.Dashboard;
import pageObjects.Properties;

public class PropertiesTC extends base
{
	public WebDriver driver;
	
	private static Logger log = LogManager.getLogger(DashBoardPage.class.getName());
	@BeforeTest
	public void initialize() throws IOException 
	{

		 driver=initializedriver();
		 log.info("driver is initialized");
		 driver.get(prop.getProperty("url"));
		 log.info("navigated to Dashboard Page");
	}
	@Test
	public void navigatetoproperties() throws InterruptedException 
	{
		Properties p = new Properties(driver);
		 
		 p.getLoginLink("testuser3377@io.co.za","Password!@!@3377");
		 log.info("successfully navigated to dashboard page");
		 Thread.sleep(3000);
		
		 WebElement propertieselement = driver.findElement(By.xpath("//a[contains(text(),'Properties')]"));
		 Actions action = new Actions(driver);
		 Thread.sleep(3000);
		 action.moveToElement(propertieselement);
		 driver.findElement(By.xpath("//a[contains(text(),'Properties')]")).click();
		 System.out.println("properties clicked");
		 Thread.sleep(3000);
		 
		 p.getnewproperty().click();
		 Thread.sleep(3000);
		 System.out.println("newproperty clicked");
		 
		 //Property Details
		 
		 driver.findElement(By.xpath("//i[contains(@class,'q-select__dropdown-icon material-icons')]")).click();
		 
		 driver.findElement(By.xpath("//div[text()='My New Test Group1']")).click();
		 //selectAndVerifyPropertytType("My New Test Group1");
		 
		 String property = "My Test Hotel";
		 p.getpropertyname().sendKeys(property);
		 
		 driver.findElement(By.xpath("(//i[contains(@class,'q-select__dropdown-icon material-icons')])[2]")).click();
		 
		 driver.findElement(By.xpath("//div[@class='q-item__label']")).click();
		 
		 driver.findElement(By.xpath("(//input[@class='q-field__native q-placeholder'])[2]")).sendKeys("Megha88");
		 
		 driver.findElement(By.xpath("(//i[contains(@class,'q-select__dropdown-icon material-icons')])[3]")).click();
		 
		 driver.findElement(By.className("q-item__label")).click();
		 
		 driver.findElement(By.cssSelector("div:nth-of-type(6) > div:nth-of-type(2) .absolute-full.fit.q-checkbox__svg")).click();
		 
		 driver.findElement(By.cssSelector("div:nth-of-type(3) .absolute-full.fit.q-checkbox__svg")).click();
		 
		 driver.findElement(By.xpath("(//input[@class='q-field__native q-placeholder'])[3]")).sendKeys("167 linden street");
	
		 driver.findElement(By.xpath("//input[@data-cy='city']")).sendKeys("johanceberg");
		 
		 driver.findElement(By.xpath("//input[@data-cy='zip-code']")).sendKeys("2196");
		 
		 driver.findElement(By.xpath("(//i[@role='presentation'])[4]")).click();
		 
		 driver.findElement(By.xpath(" //div[contains(text(),'India')]")).click();
		 
		 driver.findElement(By.xpath("//input[@data-cy='email']")).sendKeys("my-new-test-group@io.co.za");
		 
		 driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		 
		 
		 
		 //GateWay Details
		
		 
		 
		 
		 WebElement gatewayelementtype = driver.findElement(By.xpath("//i[contains(@class,'q-select__dropdown-icon material-icons')]"));
		 Thread.sleep(3000);
		 action.moveToElement(gatewayelementtype);
		 driver.findElement(By.xpath("//i[contains(@class,'q-select__dropdown-icon material-icons')]")).click();
		
		 
		 System.out.println(" gatewayelementtype clicked");
		 
		 driver.findElement(By.xpath("//div[contains(@class,'q-item__section column')]")).click();
		
		 System.out.println("type clicked");
		 
		 
		 
		 driver.findElement(By.xpath("//input[@data-cy='mac-address']")).sendKeys("2C:54:91:88:C9:E3");
		 
		 driver.findElement(By.xpath("//input[@data-cy='ip-address']")).sendKeys("17.5.7.8");
		 
		 driver.findElement(By.xpath("//input[@data-cy='dns-name']")).sendKeys("mytest.com");
		 
		 //GateWay Login
		 
		 driver.findElement(By.xpath("//input[@data-cy='username']")).sendKeys("mynewtestgroup@io.co.za");
		 
		 driver.findElement(By.xpath("//input[@data-cy='password']")).sendKeys("mynewtest@1234");
		 
		 driver.findElement(By.xpath("//span[text()='Continue']")).click();
		 
		 
		 //Interface
		 //driver.findElement(By.xpath("(//i[contains(@class,'q-select__dropdown-icon material-icons')])[2]")).click();
		 
		 WebElement interfacetype = driver.findElement(By.xpath("//i[contains(@class,'q-select__dropdown-icon material-icons')]"));
		 Thread.sleep(3000);
		 action.moveToElement(interfacetype);
		 driver.findElement(By.xpath("//i[contains(@class,'q-select__dropdown-icon material-icons')]")).click();
		 System.out.println("interfacetype clicked");
		 
		 driver.findElement(By.xpath("//div[contains(@class,'q-item__section column')]")).click();
		 
		 driver.findElement(By.xpath("//input[@class='q-field__native q-placeholder']")).sendKeys("100857");
		 
		
		 
		 WebElement packagedropdown = driver.findElement(By.xpath("(//i[contains(@class,'q-select__dropdown-icon material-icons')])[2]"));
		 Thread.sleep(3000);
		 action.moveToElement(packagedropdown);
		 driver.findElement(By.xpath("(//i[contains(@class,'q-select__dropdown-icon material-icons')])[2]")).click();
		 System.out.println("packagedropdown");
		 
		 driver.findElement(By.xpath("//div[contains(@class,'q-item__section column')]")).click();
		 
		 driver.findElement(By.xpath("(//input[@class='q-field__native q-placeholder'])[2]")).sendKeys("1111");
		 
		 driver.findElement(By.xpath("(//input[@class='q-field__native q-placeholder'])[3]")).sendKeys("2222");
		 
		 driver.findElement(By.xpath("//span[@class='block']")).click();
		 
		 //Portal
		 WebElement portalropdown = driver.findElement(By.xpath("//i[contains(@class,'q-select__dropdown-icon material-icons')]"));
		 Thread.sleep(3000);
		 action.moveToElement(portalropdown);
		 driver.findElement(By.xpath("//i[contains(@class,'q-select__dropdown-icon material-icons')]")).click();
		 System.out.println("portalropdown");
		
		 
		 driver.findElement(By.xpath("//div[contains(@class,'q-item__section column')]")).click();
		 System.out.println("clicked");
		 
		 //driver.findElement(By.xpath("//span[contains(@class,'q-btn__content text-center')]//span")).click();
		 //System.out.println("finish button");
		 
		 
		 
		 WebElement finishbutton = driver.findElement(By.xpath("//span[contains(@class,'q-btn__content text-center')]//span"));
		 Thread.sleep(3000);
		 action.moveToElement(finishbutton);
		 driver.findElement(By.xpath("//span[contains(@class,'q-btn__content text-center')]//span")).click();
		 System.out.println("finishbutton clicked");
		 Thread.sleep(3000);
		 
		 
		 
		 
		 List<String> rowelements = getRowElements(property);
		 Assert.assertTrue(rowelements.get(1).equals("My New Test Group1"));
		 System.out.println("verifying Group"); 
		 Assert.assertTrue(rowelements.get(2).equals("Hotel"));
		 System.out.println("verifying properties"); 
		 Assert.assertTrue(rowelements.get(3).equals("ACTIVE"));
		 System.out.println("verifying status");  
		 
		 
		 
		 
		/* 
		 //CLEAN UP PROPERTIES
		 //Manage
		 driver.findElement(By.xpath("(//a[@type='button']//span)[2]")).click();
		 //delete property
		 driver.findElement(By.xpath("//span[contains(text(),'Delete property')]")).click();*/
		 
	}
	
	
	
	
	
	
	
	  private List<String> getRowElements(String group) 
	 {
		 WebElement row = driver.findElement(By.xpath("//tr[contains(normalize-space(),'My Test Hotel')]"));
		 List<WebElement> col =  row.findElements(By.tagName("td"));
		 List<String> colvalues = col.stream().map(element->element.getText()).collect(Collectors.toList());
		 System.out.println("printcolvalues"+colvalues); 
		 return colvalues;
		
	 }
	  
	 
	/*	private void selectAndVerifyPropertytType(String propertygroup) throws InterruptedException 
		{
			 Dashboard d = new Dashboard(driver);
			 SoftAssert a = new SoftAssert();
			WebElement dropdownelement=d.getpropertytype();
			dropdownelement.click();
			List<WebElement> listt =  driver.findElements(By.xpath("//div[@class='q-item__label']"));
			List<String> list1 = listt.stream().map(element->element.getText()).collect(Collectors.toList());
			
			System.out.println("dropdown list"+list1);
			 a.assertTrue(list1.containsAll(List.of("My New Test Group1"))); 
			 
			Thread.sleep(3000);
			 WebElement e = driver.findElement(By.xpath("//div[contains(text(),'"+propertygroup+"')]"));
			 Actions act = new Actions(driver);
			 act.moveToElement(e).click().perform();
			 System.out.println("gettext");
		
		}*/
	
	
	@AfterTest
    public void teardown() {
    	driver.quit();
    }
	
}
