package com.quickitdotnet.java;

public class TestMethod {

	public static void main(String[] args) {
	// Create Object of Class Test
		CarTest newtest = new CarTest();// Object Creation // Class level Variable // Instantiation process // instance //copy 
		// Automatically all properties and methods will extract from Test Class to TestMethodClass
		System.out.println("The colour of car is :"+newtest.colour);
		
		newtest.speed();
		
		
	}

}
