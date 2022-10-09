package com.quickitdotnet.java;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class CollectionConcept_Queue2 {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityBlockingQueue<Integer>();
		q.add(12);
		q.add(13);
		q.add(14);
		System.out.println("elements in the queue are "+ q);
		
		// view head of the queue
		int head = q.peek();
		System.out.println("Top element is "+head);
		//using poll()
		System.out.println(q.poll());
		
		System.out.println("New Element in queue which is in top most location"+q.peek());
	}

}
