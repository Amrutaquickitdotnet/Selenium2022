package com.quicitdotnet.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_004_webelementcommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAug2022\\drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		// How to set time for loading page
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//WebElement username = driver.findElement(By.name("username"));
		WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));// Helps you to locate
		// username field location

		// $x("//input[@name = 'username']")
		username.sendKeys("Admin");

		// Enter password in the password field
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
	WebElement loginButton =	driver.findElement(By.xpath("//button[@type ='submit']"));
	loginButton.click();
	
	
		

	}

}
