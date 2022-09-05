package com.quicitdotnet.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_003_SendingValues {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAug2022\\drivers\\Chrome\\chromedriver.exe");

		WebDriver chromedriver = new ChromeDriver();

		// chromedriver.get("https://www.facebook.com/");

		String url = "https://www.facebook.com/";
		chromedriver.get(url);
		/*
		 * 
		 * System.out.println(chromedriver.getTitle());
		 */
		String titleOfPage = chromedriver.getTitle();
		System.out.println(titleOfPage);
		

	int titleLength =	chromedriver.getTitle().length();
	System.out.println(titleLength);




	
		String currentURL = chromedriver.getCurrentUrl();
		System.out.println(currentURL);
		// Source Code of relevent page
System.out.println(chromedriver.getPageSource());
	
/*
 * chromedriver.close();// close Current window chromedriver.quit();// Close
 * browser
 */	}

}
