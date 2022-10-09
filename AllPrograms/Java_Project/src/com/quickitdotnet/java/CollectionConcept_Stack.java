package com.quickitdotnet.java;

import java.util.Iterator;
import java.util.Vector;

public class CollectionConcept_Stack {

	public static void main(String[] args) {
		Vector<String> mammals = new Vector<String>();
		mammals.add("Cat");//0
		mammals.add("Dog");//1
		mammals.add("Horse");//2
		
		//using index number 
		mammals.add(1, "Rabbit");
		mammals.remove(1);
		
		//using get()
	String myElement = 	mammals.get(2);
	System.out.println("Accessing element on second position by using get(): "+ myElement);
		
		System.out.println(mammals);
		System.out.println("*******************");
		Vector<String> animals = new Vector<String>();
		animals.add("Crocodile");
		
		animals.addAll(mammals);
		//animals.removeAllElements();
		System.out.println("New Vector is "+ animals);
		System.out.println("*********************");
		//using ierator()
		System.out.println("Updating vector list using iterator method");
		Iterator<String>  itr =animals.iterator();
		System.out.println("The size of the vector"+ animals.size());
		// using contains()
		System.out.println(animals.contains("Doggy"));
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println(", ");
		}
		
	}

}
