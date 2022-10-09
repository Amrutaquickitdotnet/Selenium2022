package com.quicitdotnet.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_013_HandleCheckboxinSelenium {

	static WebDriver driver; // i can access webdriver object anywhere
	public void launchbrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\AmrutaSeleniumAugust\\drivers\\Chrome\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.quickitdotnet.co.in/practice-project/");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window. scrollBy(0,150)");
	}
	
		public void handleCheckbox() 
		{
			
		
			
			
			
			WebElement checkbox1= driver.findElement(By.xpath("//form/div[7]/label/input"));
			
			boolean isDisplayed = checkbox1.isEnabled();
			System.out.println(isDisplayed);
			
		
		
		}
		
	
		
		
}
