package com.quicitdotnet.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_009_MultiChoiceMultiSelect {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\AmrutaSeleniumAugust\\drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("D://AmrutaSeleniumAugust//dropdown.html");
		driver.manage().window().maximize();
       WebElement cars = driver.findElement(By.id("cars"));
       Select se = new Select(cars);
       try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       se.selectByIndex(2);
       try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       se.selectByVisibleText("Audi");
       se.selectByValue("saab");
       se.deselectByIndex(2);
       se.deselectByValue("saab");
       se.deselectByVisibleText("Audi");
	}
}
