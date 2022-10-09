package com.quickitdotnet.java;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionConcept_TreeSetDescendingorder {

	public static void main(String[] args) {
		TreeSet<String> countries = new  TreeSet<String>();
		countries.add("India");//0
		countries.add("USA");//1
		countries.add("Zimbave");//2
		countries.add("Berlin");//2
		countries.add("Japan");//3
		System.out.println(countries);
		NavigableSet<String>res=  countries.descendingSet();
	Iterator<String>countriesList =	res.iterator();
	while (countriesList.hasNext()) {
		System.out.println(countriesList.next());
		
	}
		
	}
	}


