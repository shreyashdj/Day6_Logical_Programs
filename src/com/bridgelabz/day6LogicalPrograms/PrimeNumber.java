package com.bridgelabz.day6LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * 		used for loop &
		 * 		checking number is divisible by any number greater than 1
		 */
		
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
	
		if (num<=1) {
			System.out.println(num +" is neither Prime nor Composite number");
		}
		else {
				int count = 0;
				for (int i=2; i<=(num/2); i++) {
					
					if (num%i==0) {
						count++;
						break;
					}
					
				}
				if (count == 0) {
					System.out.println(num +" is Prime number");
				}else
						System.out.println(num +" is not Prime number");
		
		}
			
			
scan.close();		
	}

}
