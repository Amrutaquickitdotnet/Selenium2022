package com.quicitdotnet.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_010_HandlingStaticDropdown {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\AmrutaSeleniumAugust\\drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.quickitdotnet.co.in/practice-project");
		driver.manage().window().maximize();
       WebElement timeToContact = driver.findElement(By.id("dropdown-list"));
       Select se = new Select(timeToContact);
    
       se.selectByVisibleText("Morning");
       se.selectByValue("Afternoon");
       se.deselectByIndex(2);
     List<WebElement>dropdown =  se.getOptions();
     for(int i=0; i<dropdown.size(); i++) {
    	 System.out.println(dropdown.get(i).getText());
     }
     
	}
}
