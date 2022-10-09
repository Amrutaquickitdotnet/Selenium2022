package com.quickitdotnet.java;

import java.util.LinkedList;
import java.util.List;

public class CollectionConcept_usingLinkedList {
//ArrayList store and accessing data
	
	//LinkedList => manipulation of data  2^87
	public static void  main(String[] args)
	// linkedlist is double size than arrayList => DoubleLinkedList 
	//4 ==> 8
	{
	List<String> a1 = new LinkedList<String>();// creating linkedlist  poor in cache locality
	//adding object inside linked list add() method
	a1.add("james");//1
	a1.add("Aarti");//2
	a1.add("Bond");//3
	a1.add("Vijay");
	a1.add("test");
	a1.add(0, "Ravi");
	a1.add(6, "John");
	a1.add(3, "Sana");
	a1.removeAll(a1);
	System.out.println(a1);
	 //a1.remove(1);// removing index position by index
	 //a1.remove("Aarti");// remove object using String 
	 for(String names :a1) {
		 System.out.println(names);
	 }
	}

}
