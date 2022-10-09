package com.quickitdotnet.java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class CollectionConcept_Dequeue {

	public static void main(String[] args) {
		Deque<String> q = new ArrayDeque<String>();
		q.add("For");
		q.add("Training");
		q.add("Purpose");
		System.out.println("elements in the queue are "+ q);
		q.addFirst("Welcome");
		q.addLast("Please Join");
		System.out.println("**************");
		System.out.println("After updating elements in the queue are "+ q);
		q.removeLast();
		System.out.println("After updating elements in the queue are "+ q);
		q.removeFirst();
		System.out.println("After updating elements in the queue are "+ q);
		
		
		
	}

}
