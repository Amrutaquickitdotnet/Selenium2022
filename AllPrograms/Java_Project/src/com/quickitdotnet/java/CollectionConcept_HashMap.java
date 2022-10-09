package com.quickitdotnet.java;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionConcept_HashMap {

	public static void main(String[] args)
	{
		
		HashMap<String, Integer>languages = new HashMap<String, Integer>();
		
		languages.put("Java", 1);
		
		languages.put("C#", 2);
		languages.put("Python", 3);
		languages.put("JavaScript", 4);
		System.out.println("HashMap:"+ languages);
		
		//how to access element using hashmap
		Integer value = languages.get("JavaScript");
		String  nameofLanguage =value.toString();
		System.out.println(nameofLanguage);
		
		//return set view of Keys() by using keySet()
		System.out.println("Keys"+languages.keySet());
		
		//return set view of values using values()
		System.out.println("Values:"+ languages.values());
		
		//mapping of key pair value
		System.out.println("Key/value pairing"+ languages.entrySet());
		
		//change element with key c++
		languages.replace("C#",12);
		languages.replace("JavaScript", 4);
		System.out.println("After replacing value of C#"+languages);
		
		//remove element associated with Key "Python"
		Integer a =languages.remove("Python");
		System.out.println(a);
		System.out.println("updated hashap"+ languages);
	}
	
}
	
		
	


