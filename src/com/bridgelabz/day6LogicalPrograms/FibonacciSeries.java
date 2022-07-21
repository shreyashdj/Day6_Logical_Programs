package com.bridgelabz.day6LogicalPrograms;

import java.util.Scanner;		// imported Scanner class

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		// created scan object
		
		System.out.print("Enter number of terms : ");
		int numOfTerms = scan.nextInt();		// taking input of no. of terms
		
		System.out.println("Enter first two numbers of series : ");
		int num1 = scan.nextInt();			    // tacking input of num1
		int num2 = scan.nextInt();				// tacking input of num2
		
		System.out.println("Fibonacci Series starting from "+ num1 +","+ num2 +",... is :");
		System.out.print(num1 +","+num2);
		
		/*
		 * 	used for loop from i=3 to no. of terms 
		 * 	adding num1 & num2 to get num3
		 * 	storing values of num3 in num2 & num2 in num1
		 */
		
		int num3 = 0;
		for (int i=3; i<=numOfTerms; i++) {
			num3 = num1 + num2;
			System.out.print(","+num3);
			num1 = num2;
			num2 = num3;
			}
		
scan.close();	
	}

}
