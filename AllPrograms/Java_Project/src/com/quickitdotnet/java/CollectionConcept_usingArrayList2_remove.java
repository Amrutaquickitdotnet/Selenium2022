package com.quickitdotnet.java;

import java.util.ArrayList;
import java.util.List;

public class CollectionConcept_usingArrayList2_remove {

	public static void  main(String[] args)
	
	{
	List<Integer>al = new ArrayList<Integer>();
	//creating an object of list interface with reference to ArrayList Class
	
	// i want to add element to our arrayList 
	al.add(10);//0
	al.add(12);//1
	al.add(34);//2
	al.add(45);//3
	al.add(76);//4
// printing the current arraylist 
	
	System.out.println("Before removing element from arrayList "+ al);
	// Remove 12 number from my arrayList 
	al.remove(1);
	System.out.println("After Removing element from arrayList "+al);
	System.out.println("**************************");
	al.remove(Integer.valueOf(45));
	al.remove(Integer.valueOf(76));
	System.out.println(al);
	}

}
