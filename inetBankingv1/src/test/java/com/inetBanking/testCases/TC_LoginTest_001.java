package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
public void logintest() 
{
	driver.get(baseURL);
	
	Logger.info("url is opened");
	LoginPage lp=new LoginPage(driver);
	lp.setUsername(username);
	Logger.info("enter un");
	lp.setpassword(password);
	Logger.info("entered password");
	lp.clicksubmit();
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
		Logger.info("Login Test passed");
	}
	else 
	{
		Assert.assertTrue(false);
		Logger.info("Login test Failed");
	}
}
}
