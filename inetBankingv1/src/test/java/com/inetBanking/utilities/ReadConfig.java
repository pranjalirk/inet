package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig 
{
Properties pro;
public ReadConfig() 
{
	File src=new File("./configuration/config.properties");
	try {
	FileInputStream fis=new FileInputStream(src);
	pro=new Properties();
	pro.load(fis);
	}
	catch(Exception e) 
	{
		System.out.println("Exception is"+e.getMessage());
	}
}
//(method will read the data from properties file)
public String getApplicationURl() 
{
	String url=pro.getProperty("baseURL");
	return url;
}
public String getUsername() 
{
	String un=pro.getProperty("username");
	return un;
}
public String getpwd() 
{
	String pwd=pro.getProperty("password");
	return pwd;
}
public String getchromepath() 
{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
}
}
