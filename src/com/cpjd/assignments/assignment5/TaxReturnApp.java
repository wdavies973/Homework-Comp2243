package com.cpjd.assignments.assignment5;

import java.util.Scanner;

/*
 Author: Will Davies
 Date: 3/13/2018
 Assignment: # TaxReturnApp.java
 Course: comp2243-31
 Description: TaxReturnApp demonstrates method usage outside of the main method
*/
public class TaxReturnApp {

    public static void main(String[] args) {
        // Declare constants
        final int POVERTY_LINE = 25000;

        // Declare scanner for getting input
        Scanner console = new Scanner(System.in);

        while(true) {
            System.out.print("\nEnter yearly income (-999 to end): ");
            double annualIncome = console.nextDouble();

            // Exit program
            if(annualIncome == -999) break;
            else if(annualIncome < 0) {
                System.out.println("Annual income may not be negative.");
                continue;
            }

            System.out.print("Enter the hourly rate: ");
            double hourlyRate = console.nextDouble();
            if(hourlyRate < 0) {
                System.out.println("Hourly rate may not be negative.");
                continue;
            }

            System.out.print("Enter the consulting time in minutes: ");
            int consultingTime = console.nextInt();
            if(consultingTime < 0) {
                System.out.println("Consulting time may not be negative.");
                continue;
            }

            System.out.printf("The billing amount is $%.2f", calculateBillingAmount(hourlyRate, consultingTime, annualIncome <= POVERTY_LINE));
        }
    } // end main method

    private static double calculateBillingAmount(double hourlyRate, int consultingTime, boolean isLowIncome) {
        /*
         * Declare constants,
         * They are declared here instead of in the main method because the assignment only specified 3 parameters
         * for this method
         */
        final double LOW_INCOME_RATE = 40; // these are percentages of total, not the discount amount
        final double NORMAL_RATE = 70;
        final int LOW_INCOME_CONSULTING_LIMIT = 30;
        final int NORMAL_INCOME_CONSULTING_LIMIT = 20;

        /*
         * This calculates the billing amount
         */
        return hourlyRate * (isLowIncome ?
                // low income == true, return the multiplier for the hourly rate, 0 if within limit, or 0.40 * hourlyRate if above limit, and multiply by consulting time
                (consultingTime <= LOW_INCOME_CONSULTING_LIMIT ? 0 : (LOW_INCOME_RATE / 100.0 * ((double)(consultingTime - LOW_INCOME_CONSULTING_LIMIT) / 60.0)))
                // low income == false, return the multiplier for the hourly rate, 0 if within limit, or 0.70 * hourlyRate if above limit, and multiply by consulting time
                : (consultingTime <= NORMAL_INCOME_CONSULTING_LIMIT ? 0 : (NORMAL_RATE / 100.0 * ((double)(consultingTime - NORMAL_INCOME_CONSULTING_LIMIT) / 60.0))));
    }

} // end class
