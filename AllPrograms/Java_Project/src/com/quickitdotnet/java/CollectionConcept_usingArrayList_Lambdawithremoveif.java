package com.quickitdotnet.java;

import java.util.ArrayList;
import java.util.Iterator;


public class CollectionConcept_usingArrayList_Lambdawithremoveif {

	public static void  main(String[] args)
	
	{
	
	 
	ArrayList<String> cities = new ArrayList<String>();// creating an object of arrayList 
	// adding cities inside my arralyList 
	cities.add("Berlin");
	cities.add("Bilbao");
	cities.add("Cape Town");
	cities.add("New York");
	cities.add("Great Britain");
	cities.add("Sydney");
	cities.add("Pune");
	System.out.println("Size of cities are: "+ cities.size());
	System.out.println("Showing all the elements in the ArrayList ");
	for(String allCities: cities) {
		System.out.println( allCities);
	}
	// Removing element which start with "B" using removeIf() method 
	cities.removeIf(p->(p.charAt(0)=='B'));// Lambda Expression with removeif() method
	System.out.println("**************************");
	for(String allCities: cities) {
		System.out.println( allCities);
	}
	}

}
