package com.quicitdotnet.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_006_findelementsExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\AmrutaSeleniumAugust\\drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		  
		
		//List<WebElement>allcountries = driver.findElements(By.id("country"));
		Select se = new Select(driver.findElement(By.id("country")));
		List<WebElement>allcountries  = se.getOptions();
		
		System.out.println("Count of All countries "+ allcountries.size());
		for(WebElement countriesList :allcountries) {
			System.out.println(countriesList.getText());
		}
		
		// use Select Class in Selenium 
	}

}
