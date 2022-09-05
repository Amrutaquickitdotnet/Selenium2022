package com.quickitdotnet.java;

public class Example_023_CloningArray {

	public static void main(String[] args) {
		int arr[] = { 33, 56, 76 };
		System.out.println("Printing original array:");
		for (int a : arr)

		{

			System.out.println(a);
		}
		System.out.println("Printing clone array");
		int[] newarray = arr.clone();
		for (int b : newarray) {
			System.out.println(b);
		}

	}
}
