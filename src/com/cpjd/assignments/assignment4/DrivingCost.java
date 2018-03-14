package com.cpjd.assignments.assignment4;

import java.util.Scanner;

/*
 Author: Will Davies
 Date: 2/20/2018
 Assignment: #4 DrivingCost.java
 Course: comp2243-31
 Description: Calculates certain costs related to driving
*/
public class DrivingCost {

    public static void main(String[] args) {
        // Setup scanner for getting input
        Scanner console = new Scanner(System.in);

        // declare variables
        int totalMilesDriven = 0;
        double totalGallonsUsed = 0;

        // Start fetching data
        while(true) {
            System.out.print("Enter the gallons used (-1 to end): ");
            double gallonsUsed = console.nextDouble();
            if(gallonsUsed < 0 && gallonsUsed != -1) {
                System.out.println("Error: Gallons used cannot be negative. Exiting...");
            }
            if(gallonsUsed == -1) break; // if the user entered -1, exit the loop and do overall calculations
            System.out.print("Enter the miles driven: ");
            int milesDriven = console.nextInt(); // get the number of miles driven
            if(milesDriven < 0) {
                System.out.println("Error: Miles driven cannot be negative. Exiting...");
            }
            // Output MPG for this loop
            System.out.printf("The miles / gallon for this tank was %.1f\n\n", ((double)milesDriven / gallonsUsed));
            // Update totals
            totalMilesDriven += milesDriven;
            totalGallonsUsed += gallonsUsed;
        }

        // Output totals
        if(totalGallonsUsed == 0) System.out.println("Total gallons used is 0, calculation could not be performed.");
        else System.out.printf("The overall average miles/gallon was %.1f", ((double)totalMilesDriven / totalGallonsUsed));
    } // end main method
} // end class
