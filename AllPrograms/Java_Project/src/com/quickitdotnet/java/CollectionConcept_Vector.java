package com.quickitdotnet.java;

import java.util.Vector;

public class CollectionConcept_Vector {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>(null);
		Vector<String> v2= new Vector<String>();
		v2.add("Ravi");
v1.add(6);
v1.add(2);
v1.add(1);
v1.add(3);
System.out.println(v1);
v1.set(3, 12);
v1.remove(0);
v1.removeElement(v2);
System.out.println("After updating the value of vector:"+ v1);
/*
 * for(int i=0; i<v1.size(); i++) { System.out.println(v1.get(i)+" "); }
 */

for(Integer numbers:v1) {
	System.out.println(numbers);
}
	}

}
