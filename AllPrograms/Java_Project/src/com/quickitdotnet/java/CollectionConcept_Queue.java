package com.quickitdotnet.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

public class CollectionConcept_Queue {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		for(int i=0; i<5; i++) {
			q.add(i);
		}
		System.out.println("elements in the queue are "+ q);
		// remove head of the queue
		
		int removedel = q.remove();
		System.out.println(removedel);
		System.out.println(q);
		// view head of the queue
		int head = q.peek();
		System.out.println("Top element is "+head);
		// view tail of the queue

		int size = q.size();
		System.out.println("Size of the q are "+ size);
	}

}
