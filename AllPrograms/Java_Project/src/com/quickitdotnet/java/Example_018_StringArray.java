package com.quickitdotnet.java;

public class Example_018_StringArray {

	public static void main(String[] args) {
	String[] names = {"Joe", "Mary", "Joe"};// defining array 
//	for(int i =0; i<names.length; i++) {
//		System.out.println(names[i]);
//	}// simple for loop
	// Advanced loop
	for(String allnames :names) {
		System.out.println(allnames);
	}
	
}
}
