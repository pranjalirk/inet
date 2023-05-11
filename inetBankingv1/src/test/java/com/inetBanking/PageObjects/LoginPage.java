package com.inetBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

@FindBy(xpath="//input[@type='text']") private WebElement username;
@FindBy(xpath="//input[@type='password']") private WebElement password;
@FindBy(xpath="//input[@type='submit']") private WebElement login;

WebDriver driver;

 public LoginPage(WebDriver rdriver) 
{
	driver=rdriver;
	PageFactory.initElements(rdriver, this);
}
 
 public void setUsername(String uname)
 {
	 username.sendKeys(uname);
 }
 public void setpassword(String pwd) 
 {
	 password.sendKeys(pwd);
 }
 public void clicksubmit()
 {
	 login.click();
 }

}
