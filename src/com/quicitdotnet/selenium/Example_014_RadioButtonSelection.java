package com.quicitdotnet.selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_014_RadioButtonSelection {

	static WebDriver driver; // i can access webdriver object anywhere
	public void launchbrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\AmrutaSeleniumAugust\\drivers\\Chrome\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		
	}
	
		public void handleRadioButton() 
		{
			//clicking on male Radio button
		WebElement maleElement = driver.findElement(By.xpath("//*[contains(text(),'Male')]"));
		maleElement.click();
		// impilcit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement FemaleElement = driver.findElement(By.xpath("//*[contains(text(),'Female')]"));
		FemaleElement.click();
		
		}

	
		
		
}
