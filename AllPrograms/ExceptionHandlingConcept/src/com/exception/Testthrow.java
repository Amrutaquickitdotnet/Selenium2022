package com.exception;

public class Testthrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validateage(19);
	}
	
	public static void validateage(int age) {
		if(age<18) {
			
			throw new ArithmeticException("Person is not eligable to vote");
			
		}else {
			System.out.println("he can vote");
		}
	}

}
