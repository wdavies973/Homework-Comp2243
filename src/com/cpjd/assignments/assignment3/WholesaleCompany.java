package com.cpjd.assignments.assignment3;

import java.util.*;

/*
 Author: Will Davies
 Date: 1-30-18
 Assignment: #3, WholesaleCompany.java
 Course: comp2243-31
 Description: Utility for calculating pricing of goods with a discount
*/
public class WholesaleCompany {
	
	public static void main(String[] args) {
		//declare constants
		final double PRODUCT_PRICE = 25.99;
		
		//declare variables
		int quantity;
		double discount = 0;
		double totalPrice;
		
		//declare scanner for input
		Scanner console = new Scanner(System.in);
		
		//get input
		System.out.print("Enter the quantity of product you'd like to purchase: ");
		quantity = console.nextInt();
		
		//verify input
		if(quantity <= 0) {
			System.out.println("You must enter a valid quantity that is greater than 0.");
			System.exit(0);
		}
		
		//determine the discount
		if(quantity >= 101) discount = 0.5; //50%
		else if(quantity >= 76) discount = 0.35; //35%
		else if(quantity >= 51) discount = 0.25; //25%
		else if(quantity >= 26) discount = 0.15; //15%
		else if(quantity >= 10) discount = 0.1; //10%
		
		//calculate the price
		totalPrice = (PRODUCT_PRICE * (double)quantity) * (1 - discount); // subtract discount from 1, because, for example, a 10% discount means 90% of the original cost
		
		//output data
		System.out.printf("You qualified for a discount of %.0f%%. Your total price with discount is $%.2f.", discount * 100, totalPrice);
		
	} //send main
} //end class
