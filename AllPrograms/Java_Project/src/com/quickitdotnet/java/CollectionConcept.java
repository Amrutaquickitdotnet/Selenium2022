package com.quickitdotnet.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionConcept {

	public static void  main(String[] args)
	
	{
	//Enum => I can save any data type 
		//int[] a = {1,2,3,"rest"};
		// child to parent relationship
		List<String> a =  new ArrayList<String>();
		// Disadvantage : Duplicancy of Data Take place to overcome this problem Set come in the picture 
		// For adding Element 
		a.add("Aarti");//0
		a.add("Vijay");//1
		a.add("Aarti");//2
		a.add("Test");//3
		//System.out.println(a);
		//traversing list trough iterator
		Iterator<String> itr = a.iterator(); // While loop always be work with Iterator collection
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
