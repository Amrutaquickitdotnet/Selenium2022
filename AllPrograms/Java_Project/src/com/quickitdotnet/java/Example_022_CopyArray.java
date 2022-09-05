package com.quickitdotnet.java;

public class Example_022_CopyArray {

	public static void main(String[] args) {
		char[] copyFrom = {'a' , 'e' , 'i', 'o', 'u'};
		// There should be a container in which i can kept copy of CopyFrom
		char[] copyTo = new char[6];
		// copying array using System.arraycopy() method 
		System.arraycopy(copyFrom, 0, copyTo, 2, 4);
		
		//printing the destinationArray 
		System.out.println(String.valueOf(copyTo));
	}
}
