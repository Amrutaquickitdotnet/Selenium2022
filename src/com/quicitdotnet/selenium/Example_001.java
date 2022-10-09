package com.quicitdotnet.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Example_001 
{
	//Scope of class

	public static void main(String[] args) // main entry point 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumAug2022\\drivers\\Firefox\\geckodriver.exe");// Driverbased browser  Setting path for driver browser
		WebDriver driver = new FirefoxDriver();// This will helps you to open chromeBrowser
		driver.manage().window().maximize();// maximise browser resolution
		driver.get("https://www.myntra.com/");// Url is opening
		driver.close();// driver is getting close

	}

}
