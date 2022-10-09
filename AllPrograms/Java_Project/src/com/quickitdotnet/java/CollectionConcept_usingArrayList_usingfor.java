package com.quickitdotnet.java;

import java.util.ArrayList;
import java.util.Iterator;


public class CollectionConcept_usingArrayList_usingfor {

	public static void  main(String[] args)
	
	{
	
	 
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(20);//0
		numbers.add(21);//1
		numbers.add(22);//2
		numbers.add(23);//3
		
		System.out.println(numbers);
	
		
		System.out.println("size of List:"+ numbers.size());
		for(int i=0; i< numbers.size(); i++) {
			System.out.println("Number="+ numbers.get(i));
		}
		/*
		 * for(Integer num :numbers) { System.out.println("Number="+ num); }
		 */
		numbers.remove(3);
		System.out.println("After removing index position 3 :");
		for(Integer no :numbers) {
			System.out.println(no);
		}
	}

}
