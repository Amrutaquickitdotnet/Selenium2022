package com.quickitdotnet.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionConcept_usingArrayList3_remove3withiterator {

	public static void  main(String[] args)
	
	{
	List<Integer>al = new ArrayList<Integer>();
	//creating an object of list interface with reference to ArrayList Class
	byte b =10;
	
	int a = 12;// conversion from int to byte data type
	byte result;
	result = (byte) (a+b);
	System.out.println(result);
	// i want to add element to our arrayList 
	al.add(18);//0
	al.add(20);//1
	al.add(30);//2
	al.add(4);//3
	al.add(5);//4
	al.add(56);
// printing the current arraylist 
	
	System.out.println("Before removing element from arrayList "+ al);
	
	
	// creating iterator object
	Iterator itr = al.iterator();
	// Holds true till there is  single element remaining in the object 
	while(itr.hasNext()) 
	{
		// int  long ==> Conversion from One Data Type to another
		int x = (Integer)itr.next();// Concept of TypeCasting  want to convert object to int 
		if(x<10) {
			itr.remove();
		}
		System.out.println("After removing through iterator object "+al);
	}
	
	}

}
