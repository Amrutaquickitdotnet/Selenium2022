package com.quicitdotnet.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_012_UnderstandingListDropdown {

	static WebDriver driver; // i can access webdriver object anywhere
	public void launchbrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\AmrutaSeleniumAugust\\drivers\\Chrome\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.practo.com/");
		driver.manage().window().maximize();
	}
	
		public void search() {
		

	       driver.findElement(By.xpath("//input[@placeholder = 'Search doctors, clinics, hospitals, etc.']")).sendKeys("physician");
	       //allows you to click on login button 
		}
		
		
		public void listOfConfiguration() {	
		List<WebElement> config = 	driver.findElements(By.xpath("//div[@class='c-omni-suggestion-list']"));
		Iterator<WebElement> configList = config.iterator();
		while(configList.hasNext()) {
			System.out.println(configList.next().getText());
		}
		
		}
}
