package com.cpjd.assignments.assignment3;

import java.util.*;
/*
 Author: Will Davies
 Date: 1-30-18
 Assignment: #3, IntegerCalculator.java
 Course: comp2243-31
 Description: Outputs some information about two integers the user entered
*/
public class IntegerCalculator {

	public static void main(String[] args) {
		//declare variables
		int n1, n2;
		
		//declare scanner for getting input
		Scanner console = new Scanner(System.in);
		
		//get input
		System.out.print("Enter n1: ");
		n1 = console.nextInt();
		System.out.print("Enter n2: ");
		n2 = console.nextInt();
		
		//output the greater number or if they're equal
		if(n1 == n2) System.out.println("The numbers are equal.");
		else if(n1 > n2) System.out.println("n1 is greater than n2.");
		else System.out.println("n2 is greater than n1.");
		
		//determine if n2 is a factor of n1
        if(n2 == 0) System.out.println("Error: n2 cannot be 0.");
		else if(n1 % n2 == 0) System.out.println("n2 is a factor of n1.");
		else System.out.println("n2 is NOT a factor of n1.");
	}//end main
}//end class
