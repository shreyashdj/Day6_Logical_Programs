package com.bridgelabz.day6LogicalPrograms;

import java.util.Scanner;

public class Stopwatch {

	public static void main(String[] args) {	

		/*
		 * 		using while loop &
		 * 		taking input from user till required no. is entered
		 * 		used currentTimeMillis() method of System class
		 * 		it returns current time in milliSeconds
		 */
		
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * 		Start Stopwatch
		 */
		
		System.out.print("Press 1 & Enter to start the Stopwatch : ");
		num = scan.nextInt();
		
		while(num!=1) {
			System.out.print("Press 1 & Enter to start the Stopwatch : ");
			num = scan.nextInt();
		}		
			long startTime = System.currentTimeMillis();
			System.out.println("\n  Stopwatch is Started");
			
			/*
			 * 		Stop Stopwatch
			 */
				
		System.out.print("\nPress 2 & Enter to stop the Stopwatch : ");
		num = scan.nextInt();
		
		while(num!=2) {
			System.out.print("Press 2 & Enter to stop the Stopwatch : ");
			num = scan.nextInt();
		}		
		long stopTime = System.currentTimeMillis();
		System.out.println("\n  Stopwatch is Stopped");
		
		/*
		 * 		calculating elapsed time
		 */
		
		long elapsed = stopTime - startTime;
		long minutes = ((elapsed / 1000) / 60);		// (elapsed/1000) is time in seconds
		long seconds = ((elapsed / 1000) % 60);
		System.out.println("\n Elapsed Time is " + minutes +" Minutes & " + seconds +" Seconds");

scan.close();
	}

}
