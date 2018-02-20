package com.cpjd.assignments.assignment4;

import java.util.Scanner;

/*
 Author: Will Davies
 Date: 2/20/2018
 Assignment: #4 GasCalculator.java
 Course: comp2243-31
 Description: Calculates the gas prices based off some user entry
*/
public class GasCalculator {

    public static void main(String[] args) {
        // Create scanner for getting input
        Scanner console = new Scanner(System.in);

        // define constants
        final int GRADE_1 = 87;
        final int GRADE_2 = 89;
        final int GRADE_3 = 93;
        final String GRADE_1_NAME = "Regular";
        final String GRADE_2_NAME = "Plus";
        final String GRADE_3_NAME = "Premium";
        final double GRADE_1_PRICE = 2.45;
        final double GRADE_2_PRICE = 2.89;
        final double GRADE_3_PRICE = 3.09;

        // define variables
        double totalGrade1GallonsSold = 0;
        double totalGrade2GallonsSold = 0;
        double totalGrade3GallonsSold = 0;


        // start outputting the menu
        System.out.println("Welcome to \"Your Friendly Gas Station\"");

        loop : while(true) {
            System.out.println("\n*********************************************************");
            System.out.println("Enter the gas number "+GRADE_1+", "+GRADE_2+", or "+GRADE_3+" to start or 0 to exit.");

            System.out.println("\n"+GRADE_1+" --- "+GRADE_1_NAME+"\t$"+GRADE_1_PRICE);
            System.out.println(GRADE_2+" --- "+GRADE_2_NAME+"\t$"+GRADE_2_PRICE);
            System.out.println(GRADE_3+" --- "+GRADE_3_NAME+"\t$"+GRADE_3_PRICE);
            System.out.println(" 0 --- Exit");

            // Get input
            System.out.print("\nSelect a number: ");
            int input = console.nextInt();

            // Process the selection
            double priceTier;
            switch(input) {
                case GRADE_1:
                    priceTier = GRADE_1_PRICE;
                    break;
                case GRADE_2:
                    priceTier = GRADE_2_PRICE;
                    break;
                case GRADE_3:
                    priceTier = GRADE_3_PRICE;
                    break;
                case 0:
                    // stop the loop
                    break loop; // this has to use the name of the loop, otherwise it only breaks out of the switch statement
                default:
                    System.out.println("Invalid selection (enter "+GRADE_1+", "+GRADE_2+", or "+GRADE_3+").\nPlease try again.");
                    continue;
            }

            System.out.print("\nEnter the gallons sold: ");
            double gallonsSold = console.nextDouble();

            // Validate gallons input
            if(gallonsSold < 0) {
                System.out.println("gallons sold ust be greater than zero.\nTry again");
                continue;
            }

            // Add to totals
            if(input == GRADE_1) totalGrade1GallonsSold += gallonsSold;
            else if(input == GRADE_2) totalGrade2GallonsSold += gallonsSold;
            else totalGrade3GallonsSold += gallonsSold;

            // Calculate price
            System.out.printf("\nThe price is $%.2f before tax.\n", gallonsSold * priceTier);
        }

        // Output totals
        System.out.println("\nTotal retail value for each grade of gas sold:");

        System.out.printf("\n"+GRADE_1_NAME+" ("+GRADE_1+"): $%.2f\n", totalGrade1GallonsSold * GRADE_1_PRICE);
        System.out.printf("\n"+GRADE_2_NAME+" ("+GRADE_2+"): $%.2f\n", totalGrade2GallonsSold * GRADE_2_PRICE);
        System.out.printf("\n"+GRADE_3_NAME+" ("+GRADE_3+"): $%.2f\n", totalGrade3GallonsSold * GRADE_3_PRICE);

        System.out.printf("\nTotal retail value of all sales: $%.2f", totalGrade1GallonsSold * GRADE_1_PRICE + totalGrade2GallonsSold * GRADE_2_PRICE + totalGrade3GallonsSold * GRADE_3_PRICE);

        System.out.println("\nThank you for using this program!");


    } // end main method
} // end class
