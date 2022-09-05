package com.quickitdotnet.java;

public class Example_017_ArraysExample {

	public static void main(String[] args) {
		
  float[] numbers = {10.89f,20.78f,30.45f, 40.45f};
  System.out.println("The index position in array container on 0th position"+" "+ numbers[0]);
  System.out.println("The index position in array container on 1st position"+" "+ numbers[1]);
  System.out.println("The index position in array container on 2nd position"+" "+ numbers[3]);
  System.out.println("The index position in array container on 3rd position"+" "+ numbers[2]);
  //System.out.println("The index position in array container on 4th position "+" "+ numbers[4]);
  // For loop => Repeatating process
  
  // initialisation, condition, increment operator 
  
  //syntax : for(int i = 0; i<= condition, increment operator)
  
  //Whenever if you want to calculate  arrays length properties you willl going to use as length. 
  //Whenever if you want to calculate  String length  you willl going to use as length as an method length(). 
  System.out.println("******************************");
  System.out.println("The length of array is "+ numbers.length);
  for(int i =0; i<numbers.length; i++)
  {
	 
	  
	  System.out.println("Numbers in my array containers are :"+numbers[i]);
  }
	}

}
