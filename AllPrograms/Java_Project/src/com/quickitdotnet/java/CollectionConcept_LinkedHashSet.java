package com.quickitdotnet.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionConcept_LinkedHashSet {

	public static void main(String[] args) {
		Set<String> countries = new  LinkedHashSet();
		countries.add("India");//0
		countries.add("USA");//1
		countries.add("UK");//2
		countries.add("UK");//2
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


