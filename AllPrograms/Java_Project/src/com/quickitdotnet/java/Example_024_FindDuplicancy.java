package com.quickitdotnet.java;

public class Example_024_FindDuplicancy {

	public static void main(String[] args) {
		// property => Feature 
		
		int[] arr = new int[] {1,2,3,4,2,7,8,8,3};
		// searches for duplicate element
		// To find length of array property
		for(int i=0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]== arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}
}
