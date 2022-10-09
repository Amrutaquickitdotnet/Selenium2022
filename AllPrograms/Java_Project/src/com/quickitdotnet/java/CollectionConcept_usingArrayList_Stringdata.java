package com.quickitdotnet.java;

import java.util.ArrayList;
import java.util.Iterator;


public class CollectionConcept_usingArrayList_Stringdata {

	public static void  main(String[] args)
	
	{
	
	 
	ArrayList<String> data = new ArrayList<String>();// creating an object of arrayList 
	data.add("Helen");
	data.add("Aarti");
	data.add("Vijay");
		
		System.out.println(data);
	data.remove("Vijay");
	System.out.println("After removing data :"+ data);
	System.out.println("*******Showing data in the arrayList*********");
		for(String name :data) {
			System.out.println(name);
		}
		
	}

}
