package com.quicitdotnet.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_008_Selectclass {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\AmrutaSeleniumAugust\\drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
          Select se = new Select(driver.findElement(By.id("country")));
          List<WebElement>countriesList = se.getOptions();
               System.out.println("Count of Countries "+ countriesList.size());
for(WebElement allcountry: countriesList) {
	System.out.println(allcountry.getText());
}
System.out.println("**********************************");
// se.selectByVisibleText("Austria");// Please select country Austria from india
//se.selectByValue("7");// Always goes inside db
se.selectByIndex(8);
//se.deselectByIndex(8);
WebElement selectedcountry = se.getFirstSelectedOption();
System.out.println(selectedcountry.getText());// I can see selected country set to be Austria
	}
}
