package com.exception;

public class HandleException2_multicatch {

	public static void main(String[] args) throws Exception {
		
		calculateindex();
		

	}
	
	public static void calculateindex() throws Exception{
		try {
			int a[] = new int[3];
			a[4]= 5;
			
		}catch (ArithmeticException e) {
			System.out.println("Arithmatic Exception occurs");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBound Exception occurs");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
		
		}
		
	
		
		

			
		
		
		

}

