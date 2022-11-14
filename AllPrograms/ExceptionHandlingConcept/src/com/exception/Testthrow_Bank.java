package com.exception;

import java.util.Scanner;

public class Testthrow_Bank {
static int depositeamount= 5000;
	public static void main(String[] args) {
		try {
			withdrawmoney();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void withdrawmoney() throws Exception {
		Scanner s = new Scanner(System.in) ;
		System.out.println("Please enter your withdraw amount");
		while (s.hasNextInt()) {
	
			int withdrawlamount =	s.nextInt();
			if(withdrawlamount>depositeamount) {
				throw new Exception("Sorry! you do not have enough money in your account");
			}else {
				System.out.println("You have enough money in your account");
			}
		}
		s.close();
			
		}
	}
	
