package com.quickitdotnet.java;

public class Example_014_NarrowingCasting {

	public static void main(String[] args) {
     Double myDouble  = 9.67;
   // conversion from double to int
     
   double  myInt =  myDouble;
   System.out.println(myInt);
   
   int d = 56;
   
   short f = (short) d;// narrowing typecasting
   
   System.out.println(f);
   

	}

}
