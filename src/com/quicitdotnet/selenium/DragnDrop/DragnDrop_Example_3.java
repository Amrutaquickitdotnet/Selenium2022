package com.quicitdotnet.selenium.DragnDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class DragnDrop_Example_3 {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\AmrutaSeleniumAugust\\drivers\\Chrome\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();


	//starting point is for drag where ending point is for drop
	driver.switchTo().frame(0);
	WebElement draggable =driver.findElement(By.xpath("//*[@id='draggable']"));

		WebElement droppable = driver.findElement(By.xpath("//*[@id = 'droppable']"));
		// click and hold
		Actions act =  new Actions(driver);
	   act.dragAndDrop(draggable, droppable).build().perform();
		
}
}
	



