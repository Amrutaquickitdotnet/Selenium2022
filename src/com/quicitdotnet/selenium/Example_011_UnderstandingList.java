package com.quicitdotnet.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_011_UnderstandingList {

	static WebDriver driver; // i can access webdriver object anywhere
	public void launchbrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\AmrutaSeleniumAugust\\drivers\\Chrome\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
		public void login() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");// allows you to enter username 
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");//allows you to enter password 
			
	       driver.findElement(By.xpath("//button[@type='submit']")).click();// allows you to click on login button 
		}
		
		
		public void listoftables() {
			
		List<WebElement> table = 	driver.findElements(By.xpath("//div[@class='oxd-table-body']"));
		Iterator<WebElement> tablelist = table.iterator();
		while(tablelist.hasNext()) {
			System.out.println(tablelist.next().getText());
		}
		
		}
}
