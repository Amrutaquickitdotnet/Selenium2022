package com.quicitdotnet.selenium.DragnDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop_Example_2 {
	static WebDriver driver;

	public static void main(String[] args) {
		launchbrowser();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dragndrop();
	}

	public static void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\AmrutaSeleniumAugust\\drivers\\Chrome\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://javascript.info/article/mouse-drag-and-drop/ball4");
		driver.manage().window().maximize();

	}

public static void dragndrop() {
	//starting point is for drag where ending point is for drop
	
	WebElement dragFrom =driver.findElement(By.id("ball"));

		WebElement dropTo = driver.findElement(By.id("gate"));
		// click and hold
		Actions act =  new Actions(driver);
	Action dragndropaction = 	act.clickAndHold(dragFrom).moveToElement(dragFrom).release(dropTo).build();
	dragndropaction.perform();
		
}

}


