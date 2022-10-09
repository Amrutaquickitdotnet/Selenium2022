package com.quickitdotnet.java;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionConcept_TreeSet {

	public static void main(String[] args) {
		Set<String> countries = new  TreeSet<String>();
		countries.add("India");//0
		countries.add("USA");//1
		countries.add("Zimbave");//2
		countries.add("Berlin");//2
		countries.add("Japan");//3
		System.out.println(countries);
		for(String allcountries :countries) {
			System.out.println(allcountries);
		}
		countries.remove("UK");
		System.out.println("After Removing country UK:");
		for(String allcountries :countries) {
			System.out.println(allcountries);
		}
		System.out.println("******Iterating through iterator***********");

		Iterator<String> allcountriesList =	countries.iterator();
		while (allcountriesList.hasNext())
		{
			System.out.println(allcountriesList.next());
			
		}
		}
		
	}


