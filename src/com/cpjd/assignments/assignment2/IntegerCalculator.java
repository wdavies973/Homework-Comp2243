package com.cpjd.assignments.assignment2;

import java.util.Scanner;

/*
 Author: Will Davies
 Date: 1-30-18
 Assignment: #2, IntegerCalculator.java
 Course: comp2243-31
 Description: Outputs some information about an integer the user entered
*/
public class IntegerCalculator {
	
	public static void main(String[] args) {
		//declare variables
		int input;
		
		//create scanner for input
		Scanner console = new Scanner(System.in);
		
		//get input
		System.out.print("Enter an integer: ");
		input = console.nextInt();
		
		//decision making
		String sign = "negative";
		if(input > 0) sign = "positive";
		else if(input == 0) sign = "neither postive or negative";
		
		//output data
		System.out.println(input+" is "+sign+".");
		System.out.println("The absolute value is "+Math.abs(input)+".");
		if(Math.abs(input) / 10 >= 1) System.out.println("It has more than one digit");
	} //end main
} //end class