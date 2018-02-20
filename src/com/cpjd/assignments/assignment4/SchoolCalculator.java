package com.cpjd.assignments.assignment4;

import java.util.Scanner;

/*
 Author: Will Davies
 Date: 2/20/2018
 Assignment: #4 SchoolCalculator.java
 Course: comp2243-31
 Description: Calculates some population statistics for a school
*/
public class SchoolCalculator {

    public static void main(String[] args) {
        // Setup scanner for getting input
        Scanner console = new Scanner(System.in);

        // Declare variables
        int schoolAStudents;
        int schoolBStudents;
        double schoolAGrowthRate;
        double schoolBGrowthRate;

        // Get input
        System.out.print("Enter the current student numbers of school A: ");
        schoolAStudents = console.nextInt();
        System.out.print("\nEnter the current student numbers of school B: ");
        schoolBStudents = console.nextInt();
        System.out.print("\nEnter the growth rate of school A (percentage): ");
        schoolAGrowthRate = console.nextDouble();
        System.out.print("\nEnter the growth rate of school B (percentage): ");
        schoolBGrowthRate = console.nextDouble();

        // Calculations - start simulating growth and solve for when the population of school A will surpass the population of school B
        int yearsPassed = 0;
        while(true) {
            yearsPassed++;

            /*
             * Process populations
             * Notice: For more accurate results, the new student count is rounded with Math.round,
             * so 3.7 students will be counted as 4 new students.
             */
            schoolAStudents += (double)schoolAStudents * (schoolAGrowthRate / 100);
            schoolBStudents += (double)schoolBStudents * (schoolBGrowthRate / 100);

            // Check population status
            if(schoolAStudents >= schoolBStudents) {
                System.out.println("\nAfter "+yearsPassed+" years the student numbers of school A will be greater than or equal to the student numbers of school B.");

                System.out.println("After "+yearsPassed+" years the student numbers of school A is "+schoolAStudents+".");
                System.out.println("After "+yearsPassed+" years the student numbers of school B is "+schoolBStudents+".");
                break;
            }
        }
    } // end main method
} // end class
