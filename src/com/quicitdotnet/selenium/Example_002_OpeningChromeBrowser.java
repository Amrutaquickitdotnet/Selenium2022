package com.quicitdotnet.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_002_OpeningChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAug2022\\drivers\\Chrome\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		//chromedriver.get("https://www.google.com");
		chromedriver.navigate().to("https://www.facebook.com");
	chromedriver.get("https://www.google.com");
	chromedriver.navigate().back();
	chromedriver.navigate().forward();
	chromedriver.navigate().refresh();
		chromedriver.manage().window().maximize();
		//chromedriver.close();
          // quit and close 
	}

}
