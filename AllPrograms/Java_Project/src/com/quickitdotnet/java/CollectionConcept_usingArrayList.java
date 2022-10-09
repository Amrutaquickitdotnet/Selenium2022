package com.quickitdotnet.java;

import java.util.ArrayList;
import java.util.Iterator;


public class CollectionConcept_usingArrayList {
// new capacity=  (current capacity*3/2)+1
	// default capacity of arraylist 10
	//10*3/2+1 = 16// First Range of capacity
	//17 =  16*3/2+1 = 25 // Second range of capacity 
	public static void  main(String[] args)
	
	{
	
	  // iterate element by using ArrayList 
		// Child to child relationship
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(20);//0
		numbers.add(21);//1
		numbers.add(22);
		numbers.add(23);
		numbers.add(24);
		numbers.add(25);
		numbers.add(65);
		System.out.println(numbers);
		Iterator<Integer> nums = 	numbers.iterator();
		while(nums.hasNext()) {
			System.out.println(nums.next());
		}

	}

}
