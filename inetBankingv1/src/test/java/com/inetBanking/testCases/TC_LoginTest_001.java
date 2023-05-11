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
	LoginPage lp=new LoginPage(driver);
	lp.setUsername(username);
	lp.setpassword(password);
	lp.clicksubmit();
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
	}
	else 
	{
		Assert.assertTrue(false);
	}
}
}
