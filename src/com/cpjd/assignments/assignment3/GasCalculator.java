package com.cpjd.assignments.assignment3;

import java.util.Scanner;

/*
 Author: Will Davies
 Date: 1-30-18
 Assignment: #3, GasCalculator.java
 Course: comp2243-31
 Description: Utility for calculating gas prices
*/
public class GasCalculator {
	
	public static void main(String[] args) {
	    //define constants
        final int GRADE_1 = 87;
        final int GRADE_2 = 89;
        final int GRADE_3 = 93;
        final double GRADE_1_PRICE = 2.65;
        final double GRADE_2_PRICE = 2.89;
        final double GRADE_3_PRICE = 3.19;

        //declare variables
		int gasGrade;
		double pricePerGallon; 
		String typeString;
		int gallonsSold;
		double totalPrice;
		
		//declare scanner for getting input
		Scanner console = new Scanner(System.in);
		
		//get input
		System.out.print("Enter the gas grade: ");
		gasGrade = console.nextInt();
		System.out.print("Enter the gallons sold: ");
		gallonsSold = console.nextInt();

		if(gallonsSold < 0) {
		    System.out.println("Error: Gallons sold cannot be less than 0.");
		    System.exit(0);
        }

		//decide which price the user must pay for gas
		switch(gasGrade) {
			case GRADE_1:
				typeString = "regular";
				pricePerGallon = GRADE_1_PRICE;
				break;
			case GRADE_2:
				typeString = "plus";
				pricePerGallon = GRADE_2_PRICE;
				break;
			case GRADE_3:
				typeString = "premium";
				pricePerGallon = GRADE_3_PRICE;
				break;
			default:
				System.out.println("You entered an invalid gas grade. Please enter a valid one.");
				return;
		}
		
		// make calculations
		totalPrice = pricePerGallon * (double)gallonsSold;
		
		//output data
		System.out.printf("The total price of %.0f gallon(s) of %s gas before tax is $%.2f.", (double)gallonsSold, typeString, totalPrice);
	} //end main
} //end class