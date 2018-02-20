package com.cpjd.assignments.assignment3;

import java.util.*;
/*
 Author: Will Davies
 Date: 1-30-18
 Assignment: #3, BMICalculator.java
 Course: comp2243-31
 Description: Displays information about the user based of his/her weight and height
*/
public class BMICalculator {

	public static void main(String[] args) {
	    // define constants
        final int BMI_MULTIPLYER = 703;
        final double OVERWEIGHT_BMI = 25;
        final double UNDERWEIGHT_BMI = 18.5;

		//declare variables
		double weight, height;
		
		//declare scanner for getting input
		Scanner console = new Scanner(System.in);
		
		//get input
		System.out.print("Enter your weight in pounds: ");
		weight = console.nextDouble();
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
		double bmi = weight * BMI_MULTIPLYER / (height * height);
		
		//make decisions about the user's health class
		String healthStatus = "optimal weight";
		if(bmi > OVERWEIGHT_BMI) healthStatus = "overweight";
		else if(bmi < UNDERWEIGHT_BMI) healthStatus = "underweight";
		
		//output data
		System.out.printf("Your body mass index is %.2f. You are %s.", bmi, healthStatus);
	}//end main
}//end class
