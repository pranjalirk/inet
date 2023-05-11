package com.inetBanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;


public class BaseClass 

{
public String baseURL="https://demo.guru99.com/v4/index.php";
public String username="mngr502391";
public String password="EbErEzA";
public static WebDriver driver;
public static Logger Logger;

@BeforeClass
public void setup()
{
	System.setProperty( "webdriver.chrome.driver","/home/ajit/Desktop/PRANJALI/selenium set up/chromedriver_linux64/chromedriver");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	Logger=Logger.getLogger("ebanking");
}
@AfterClass
public void tearDown()
{
	driver.quit();
}
}
