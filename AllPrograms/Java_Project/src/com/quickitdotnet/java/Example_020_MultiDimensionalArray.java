package com.quickitdotnet.java;

public class Example_020_MultiDimensionalArray {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];// Declaration Process
		// 3 rows 3 columns
		// Assigment 
		arr[0][0]=11;
		arr[0][1]=12;
		arr[0][2]=13;
		arr[1][0]=14;
		arr[1][1]=15;
		arr[1][2]=16;
		arr[2][0]=17;
		arr[2][1]=18;
		arr[2][2]=19;
		// for inside for loop internal for loop
		for(int i=0; i<=2;i++)// This will read row// Row loop parent loop
		{
			for(int j=0; j<=2; j++) // Column Dependency is always depends on row 
			{
				System.out.print(arr[i][j]+ " ");
			}//Columns for loop  Child loop
			System.out.println();
			
		}
	}
}
