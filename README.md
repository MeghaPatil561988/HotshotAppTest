# HotshotAppTest
#IO Automation End to End Assessment Test
# HotshotAppTest

## IO Automation End to End Assessment Test

## Introduction:

### I have documented prescribe the tools & technology, approaches, resources, of all testing activities of the project HotShot.
### This document also outlines what will be tested, the features that will be tested, and explained what worked and what did not work and what I would have done differently.

## Testing Tools and Technologies : Test Automation tool Selenium with JAVA programmimg language(version javaSE 1.8), Platform(s) - Windows 10.
   
##  Framework Architecture:
   * step 1-Installing Ecplise IDE for Java Developers in my local machine and installing Java Jdk(with Java_HOME)and set Enviroment variables for that.
   * Step 2-Installing the Selenium 4.0 library for my desired programming language.
   * Step 3-Set up the browser driver to automate my browser (e.g.  Google Chrome, Internet Explorer, and firefox).
   * Step 4-(Optional) Set up and configure Selenium WebDriver for end-to-end application testing using selenium. 
   * Located webpage elements through xpath.
   * I have used Maven to build the project.
   * I have integrated with jars to extend its functionalities and add dependencies in pom.xml file from to get maven central repository and add drivers in lib folder.
   * Used POM Design Pattern - for each web page to create separate .class file and used Encapulation concept here for variables and methods and also used constructor for same driver instance to maintain all the test cases.
   * Used TestNG : Converted my project to TestNG. I have used annotations to better understand for each testcases(@BeforeTest,@Test,@AfterTest),I am able to execute my testcases in parallel execution using .xml file.
   * Report : Testng gives the report in .index.html and also used ExtentReport whichever testcases has passed/failed.
   * data.properties file : Initialized broweser and url in this properties file.
   * Base file : Extended this base class into all the testcases. 
   * Maven Project Folder structure like this:
 ###    src/main/java folder
 ###    package-PageObjects
 ###    under this 5 .java classes(Homepage,Dashboardpage,Groupspage,PropertiespPage).
 ###    package-Resources
 ###    under this 2 .java classes(baseclass,ExtentReportNG) and data.properties file,log4j.xml file
 ###    src/test/java folder
 ###    package-testcases
 ###    under this 5 .java classes(Listeners,HomepageTC,DashboardpageTC,GroupspageTC,PropertiespPageTC)
     
## 2 Scope:
## Task 1- Login:
#What worked for me - I have successfully executed LoginTC with given user name and password credintials.I have used Parameterization to access login credentials by using @DataProvider annotation.
#What didn't work for me - NA
##What I would have done differently - I could access the credential data through Excel(datadriven with Apache POI),and JDBC.

## Task 2- Dashboard:
### What worked for me - I have successfully executed DashboardTc with given inputs, and also all test cases has successfully validated,Some of the elements on page didn't clicking through click() , so i have used for clicking elements through Action class.
### What didn't work for me - NA
### What I would have done differently - Using Javascript executer and ExplicitWait for clicking the elements,I could have access the input data through Excel(datadriven with Apache POI). 

## Task 3- Groups:
### What worked for me- I have successfully executed GroupsTc with given inputs, and also all test cases has successfully validated,Some of the elements on page didn't clicking through click() , so i have used for clicking elements through Action class..
### What didn't work for me - NA
### What I would have done differently - Using Javascript executer and ExplicitWait for clicking the elements,I could have access the input data through Excel(datadriven with Apache POI).

##  Task 4- Properties:
### What worked for me - I have successfully executed PropertiesTc with given inputs, and also all test cases has successfully validated,Some of the elements on page didn't clicking through click() , so i have used for clicking elements through Action class..
### What didn't work for me- NA
### What I would have done differently - Using Javascript executer and ExplicitWait for clicking the elements,I could have access the input data through Excel(datadriven with Apache POI).

## Task 5 - Cleanup:
### What worked for me - I didn't get enough time for this testcase to write and execute.
### What didn't work for me - 
### What I would have done differently - 

## Task 6 - Github
### I have push my IOEndEndAutomationProject from git to github with Document.
   

