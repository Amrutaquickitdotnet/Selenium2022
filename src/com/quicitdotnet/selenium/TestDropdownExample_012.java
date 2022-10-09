package com.quicitdotnet.selenium;

public class TestDropdownExample_012 {

	public static void main(String[] args) {
		Example_012_UnderstandingListDropdown b = new Example_012_UnderstandingListDropdown();
		b.launchbrowser();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.search();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.listOfConfiguration();
	}

}
