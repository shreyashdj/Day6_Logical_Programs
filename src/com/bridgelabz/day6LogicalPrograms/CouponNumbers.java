package com.bridgelabz.day6LogicalPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CouponNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the no of coupon numbers : ");
		int N = scan.nextInt();				// taking input of no. of coupon numbers
		
		int[] array = new int[N];		// declaring integer array of N elements
		
		/*
		 * 		using for loop till no. of coupon numbers
		 * 			taking coupon number from user &
		 * 			used while loop to check & count random no. till match with coupon no.
		 */
		
		int count = 0;
		System.out.println("Enter " + N + " distint Coupon numbers [1 to 100]" );
		for (int i=0; i<N; i++) {
				array[i] = scan.nextInt();
		
				while (array[i] != 0) {
					int match = (int)(Math.random()*100+1);
					count += 1;
						if (array[i] == match)					
						break;
					}
		}
		System.out.println("Coupon numers are : " + Arrays.toString(array));
		System.out.println("It took " + count + " random numbers to match with all of the coupon numbers");

scan.close();
	}

}