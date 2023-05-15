package com.inetBanking.testCases;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.inetBanking.utilities.ReadConfig;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class BaseClass 

{
	
	ReadConfig readconfig=new ReadConfig();
	
public String baseURL=readconfig.getApplicationURl();
public String username=readconfig.getUsername();
public String password=readconfig.getpwd();
public static WebDriver driver;
public static Logger Logger;

@BeforeClass
public void setup()
{
	System.setProperty( "webdriver.chrome.driver","/home/ajit/Desktop/PRANJALI/selenium set up/chromedriver_linux64/chromedriver");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	Logger =Logger.getLogger("ebanking");
	PropertyConfigurator.configure("Log4j.properties");
	
}
@AfterClass
public void tearDown()
{
	driver.quit();
}
}
