package com.quickitdotnet.java;

public class Example_016_StringManipulation {

	public static void main(String[] args) {
		String name = "GaNESha";


		System.out.println(name);

		// String length

		// 0 starting index position
		System.out.println("The length of string is " + name.length());
		// Convert to upper case

		System.out.println("The string output in upper case :" + name.toUpperCase());

		// convert to lowercase
		System.out.println("The string output in lower case are :" + name.toLowerCase());

		// Find a character in string
		String journey = "I would like to travel in various places ";
		System.out.println(journey.indexOf("would"));// output 2 ...always return position of characters within string

		// Concat Method
		String a = "Today is Ganesh chaturthi ";
		String b = "Everyone is enjoying";
		String output = a + b;
		System.out.println("Output is after using concat operator is  :" + output);
		String result = a.concat(b);
		System.out.println("After concatenation string using concat method: " + result);

		System.out.println("******************************");

		String c = "Today is raining";
		System.out.println(c.indexOf('r'));// indexof always passing either characters or String

		String date = " 31-08-2022";
		// how u can seperate day , month and year
		String[] dateExpression = date.split("-");// Returns result of String[]
		System.out.println("The day of year is " + dateExpression[0]);
		System.out.println("The month of year is " + dateExpression[1]);
		System.out.println("The year is " + dateExpression[2]);

	}

}
