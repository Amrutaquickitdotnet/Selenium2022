package com.exception;

public class HandleException {

	public static void main(String[] args) throws Exception {
		
		calculateindex();
		

	}
	
	public static void calculateindex() throws Exception{
		try {
			String s = null;
			System.out.println(s.length());//nullpointerException
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			int t = 12/0;//ARithmatic Exception
			System.out.println(t);
			String s3= "abc";
			int b =Integer.parseInt(s3);
			System.out.println(b);//NumberFormatException
		}
		}
		
	
		
		

			
		
		
		

}

