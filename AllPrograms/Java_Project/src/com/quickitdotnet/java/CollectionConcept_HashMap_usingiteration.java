package com.quickitdotnet.java;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionConcept_HashMap_usingiteration {

	public static void main(String[] args)
	{
		
		HashMap<Integer, String>languages = new HashMap<Integer, String>();
		
		languages.put(1, "Java" );
		languages.put(2, "C#");
		languages.put(3,"Python");
		languages.put(4,"JavaScript");
		System.out.println("HashMap:"+ languages);
		System.out.println("**************");
	//iterate through keys only
		System.out.println("My keys are :");
		for(Integer key :languages.keySet()) {
			System.out.print(key);
			System.out.print(",");
			
		}
		System.out.println(" ");
		
		//iterate through values only
		System.out.println("**************");
		System.out.println("My Values are:");
				for(String value :languages.values()) {
					System.out.print(value);
					System.out.print(",");
				}
				
				//iterate through Key/values entries
				System.out.print("**************");
				System.out.println("My entries are:");
						for(Entry<Integer, String> entry :languages.entrySet()) {
							System.out.print(entry);
							System.out.print(",");
						}

	}
	
}
	
		
	


