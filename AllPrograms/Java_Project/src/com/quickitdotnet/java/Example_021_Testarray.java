package com.quickitdotnet.java;

public class Example_021_Testarray {

	public static void main(String[] args) {
		int arr[] = { 4, 4, 5 };
		// getting the classname of java Array
		Class c = arr.getClass();
		String name = c.getName();
		System.out.println(name);
	}
}
