package com.bridgelabz.day6LogicalPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int number = scan.nextInt();
		
		int num = number;
		int reverseNum = 0;
		while(num!=0) {
			reverseNum = reverseNum * 10;
			reverseNum = reverseNum + num%10;
			num = num/10;
		}
	System.out.println("Reverse of number " + number + " is " + reverseNum);
		
		
scan.close();
	}
}
