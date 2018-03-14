package com.cpjd.assignments.assignment5;

import java.util.Scanner;

/*
 Author: Will Davies
 Date: 3-13-18
 Assignment: #5, BMICalculator.java
 Course: comp2243-31
 Description: Displays information about the user based of his/her weight and height with several enhancements
*/
public class BMICalculator {

	public static void main(String[] args) {
	    // define constants
        final int BMW_MULTIPLIER = 703;
        final double OVERWEIGHT_BMI = 25;
        final double UNDERWEIGHT_BMI = 18.5;

		//declare variables
		double weight, height;
		
		//declare scanner for getting input
		Scanner console = new Scanner(System.in);

		while(true) {
            //get input
            System.out.print("Enter your weight in pounds (-1 to exit): ");
            weight = console.nextDouble();

            // Exit program
            if(weight == -1) {
                System.out.println("Thank you for using this program.");
                break;
            }

            System.out.print("Enter your height in inches: ");
            height = console.nextDouble();

            //verify input, I chose some upper range values to prevent unrealistically high weight or height values
            if(weight < 1 || weight >= 1000) {
                System.out.println("Weight is invalid, please enter a valid weight between 1 and 1000 pounds.");
                System.exit(0); //exit the program because invalid parameters were entered
            }
            if(height <= 1 || height >= 100) {
                System.out.println("Height is invalid, please enter a valid height between 1 and 100 inches.");
                System.exit(0);
            }

            //make the calculations
            double bmi = calculateBMI(weight, height, BMW_MULTIPLIER);

            //output data
            System.out.printf("Your body mass index is %.2f. You are %s.\n", bmi, getHealthStatus(bmi, OVERWEIGHT_BMI, UNDERWEIGHT_BMI));
        }


	}//end main

    // Calculates body mass index based off 3 parameters: weight, height, and a BMI multiplier
    private static double calculateBMI(double weight, double height, int multiplier) {
        return weight * (double) multiplier / (height * height);
    }

    // Returns the user's health status that corresponds to their BMI
    private static String getHealthStatus(double bmi, double OVERWEIGHT_BMI, double UNDERWEIGHT_BMI) {
        if(bmi > OVERWEIGHT_BMI) return  "overweight";
        else if(bmi < UNDERWEIGHT_BMI) return  "underweight";
        return "optimal weight";
    }
}//end class
