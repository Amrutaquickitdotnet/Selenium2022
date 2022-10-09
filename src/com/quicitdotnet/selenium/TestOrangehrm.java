package com.quicitdotnet.selenium;

public class TestOrangehrm {

	public static void main(String[] args) {
		/*
		 * Example_013_HandleCheckboxinSelenium chk = new
		 * Example_013_HandleCheckboxinSelenium(); chk.launchbrowser(); try {
		 * Thread.sleep(5000); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } chk.handleCheckbox();
		 */
		Example_014_RadioButtonSelection  radio = new Example_014_RadioButtonSelection ();
		radio.launchbrowser();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		radio.handleRadioButton();

	}

}
