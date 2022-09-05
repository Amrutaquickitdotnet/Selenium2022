package com.quicitdotnet.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_005_BylinkText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAug2022\\drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// How to set time for loading page
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement link = driver.findElement(By.partialLinkText("New"));
		link.click();
		/*
		 * WebElement forgotPassword =
		 * driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']"));
		 * forgotPassword.click();
		 */
	
		

	}

}
