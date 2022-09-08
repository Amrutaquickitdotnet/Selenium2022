package com.quicitdotnet.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_007_ChoosebySelectClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\AmrutaSeleniumAugust\\drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createNewAccountButton = driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]"));
				createNewAccountButton.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		WebElement month =  driver.findElement(By.id("month"));
		
		Select se  = new Select(month);
	List<WebElement>monthDropdown = 	se.getOptions();
	System.out.println("Count of number of months inside daydropdown"+"  :  "+ monthDropdown.size());
	for(int i =0; i<monthDropdown.size();i++) 
	{
		System.out.println(monthDropdown.get(i).getText());
	}
//		Select se = new Select(day);// Passing parameters to object 
//		se.selectByVisibleText("29");
		
	/*
	 * 
	 * WebElement month = driver.findElement(By.id("month")); Select se1 = new
	 * Select(month);// Passing parameters to object se1.selectByVisibleText("Feb");
	 * 
	 * WebElement year = driver.findElement(By.id("year")); Select se2 = new
	 * Select(year);// Passing parameters to object se2.selectByVisibleText("2020");
	 */
		
	}

}
