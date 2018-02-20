package com.cpjd.assignments.assignment1;

import java.util.Scanner;
/*
 Author: Will Davies
 Date: 1-16-18
 Course: comp2243-31
 Assignment: #1, Revenue.java
 Description: Calculates the revenue from movie sales
*/
public class Revenue {
   public static void main(String[] args) {
       //create a scanner object
       Scanner console = new Scanner(System.in);
       
       //declare constants
       final double MOVIE_TICKET_PRICE = 25.99;
       final double SENIOR_DISCOUNT = 0.3;
       final double FOOD_COST = 12.99;
       
       //declare variables
       double seniorRevenue;
       double nonSeniorRevenue;
       double total;
       int numSeniors;
       int numNonSeniors;
       
       //output
       System.out.println("Revenue Program");
       
       //get input
       System.out.print("Enter the number of seniors: ");
       numSeniors = console.nextInt();
       System.out.print("Enter the number of non-seniors: ");
       numNonSeniors = console.nextInt();
       
       /*
        * Calculate the price per senior, then multiple by the num of seniors. Food cost not eligible for discount
        * Note: SENIOR_DISCOUNT must be subtracted from 1 because a 30% discount means 70% of the original cost
        */
       seniorRevenue = ((FOOD_COST + (MOVIE_TICKET_PRICE * (1.0 - SENIOR_DISCOUNT))) * numSeniors);
       
       // calculate the price per non senior, then multiple by the number of non seniors
       nonSeniorRevenue = (MOVIE_TICKET_PRICE + FOOD_COST) * numNonSeniors;
       
       //calculate
       total = seniorRevenue + nonSeniorRevenue;
       
       //output
       System.out.println("\nThe Revenue information:\n\n*****************************************");
       System.out.println("Senior Visitors: "+numSeniors);
       System.out.println("Non-Senior Visitor: "+numNonSeniors);
       System.out.println();
       System.out.println("Total Number of Visitors: "+(numSeniors + numNonSeniors));
       System.out.println();
       System.out.println("Senior Visitor Revenue: $"+seniorRevenue);
       System.out.println("Non-Senior Visitor Revenue: $"+nonSeniorRevenue);
       System.out.println();
       System.out.println("Total Revenue: $"+total);
   } //end main
} //end class