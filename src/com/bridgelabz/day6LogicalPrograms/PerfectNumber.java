package com.bridgelabz.day6LogicalPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = scan.nextInt();		// taking input of number
		
		/*
		 * 		used for loop &
		 * 		finding divisors of number and calculating sum of them
		 * 		checking if no. is perfect number or not by comparing divisors sum & number
		 */
		
		int sum = 0;
		for (int i=1; i<=(num/2); i++) {
			
			if (num%i==0) 
				sum+=i;
		}

		if (num == sum)
			System.out.println(num +" is Perfect number");
		else
			System.out.println(num +" is not Perfect number");
		
scan.close();
	}

}
