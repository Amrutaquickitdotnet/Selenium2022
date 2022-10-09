package com.quickitdotnet.java;

import java.util.EnumSet;
import java.util.Set;

public class CollectionConcept_EnumSet {
enum maths {code, quiz, Learn, contibute};
	public static void main(String[] args) {
		/*
		 * Set<languages> langset; langset = EnumSet.of(languages.Marathi,
		 * languages.Hindi, languages.Kannada);
		 * System.out.println("Set of languages are :"+ langset);
		 */
		EnumSet<maths> set1, set2, set3, set4;
		
		set1= EnumSet.of(maths.code, maths.quiz, maths.Learn, maths.contibute);
		set2 = EnumSet.complementOf(set1);
		set3 = EnumSet.allOf(maths.class);
		set4 = EnumSet.range(maths.code, maths.Learn);
		System.out.println("Element available in set 1 are :"+ set1);
		System.out.println("Element available in set 2 are :"+ set2);
		System.out.println("Element available in set 3 are :"+ set3);
		System.out.println("Element available in set 4 are :"+ set4);
		
		
		}
		
	}


