package com.quickitdotnet.java;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionConcept_HashTable {

	public static void main(String[] args)
	{
		
		Hashtable<Integer, String>  ht = new Hashtable<Integer, String>();
				// Adding element in hashtable
		ht.put(1, "One");
		ht.put(11, "Eleven");
		ht.put(13, "Thirteen");
		ht.put(5, "Five");
		ht.put(4, "Four");
		System.out.println(ht);
		System.out.println("****Removing element of 13");
		ht.remove(13);
		System.out.println("After removing key 13"+ ht);
		if(ht.containsKey(11)) {
			String a = ht.get(11);
			System.out.println("value for key for 11 is :" + a);
		}
		for(Entry<Integer, String>e :ht.entrySet()) 
		{
			System.out.println(e.getKey()+": " +" "+ e.getValue());
		}
	}
	
}
	
		
	


