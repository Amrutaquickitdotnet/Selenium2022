package com.quickitdotnet.java;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class CollectionConcept_Vector3 {
	public static void main(String[] args) {
		Stack<Integer>stack = new Stack<Integer>();
		stack_push(stack);//add
		stack_pop(stack);// remove
		stack_push(stack);
		stack_peek(stack);
		stack_push(stack);
		stack_search(stack, 2);
	}
	static void stack_push(Stack<Integer> stack) {
		
		for(int i=0; i<5; i++) {
			stack.push(i);
		}
	}
		//poping element from the top of the stack
		static void stack_pop(Stack<Integer> stack){
			System.out.println("Popinng up element from stack");
			for(int i=0; i<5; i++) {
			Integer y =  stack.pop();	
			System.out.println(y);
			}
			}
		static void stack_peek(Stack<Integer>stack ) {
		Integer element = stack.peek();
		System.out.println("Element in stack top "+ element);
		}
		
			
			 static void stack_search(Stack<Integer>stack ,int element) {
		
			 Integer pos = (Integer)stack.search(element);
			 
			 if(pos == -1) 
			 {
			 
			 System.out.println("Element not found"+pos);
			 }
			 else {
			 System.out.println("Element is found at position "+ pos); 
			 } 
			 }
		
		}
	


