package com.cpjd.assignments.assignment1;

import java.util.Scanner;

/*
 Author: Will Davies
 Date: 1-16-18
 Course: comp2243-31
 Assignment: #1, Exercise.java
 Description: Calculate the weekly pay for hourly employee;
*/
public class Exercise {
   public static void main(String[] args) {
       //create a scanner object, this is used for getting input
       Scanner console = new Scanner(System.in);
       
       //declare constant variables, final means they can't be changed
       final int SECRET = 11;
       final double RATE = 12.50;
       
       //declare non-constant values, these will be used for storing user input and making calculations
       int num1;
       int num2;
       int newNum;
       String name;
       double hoursWorked;
       double wages;
       
       //get input and assign to num1 & num2
       System.out.print("Enter number 1: ");
       num1 = console.nextInt();
       System.out.print("Enter number 2: ");
       num2 = console.nextInt();
       
       //output what the user just input
       System.out.println("The value of num1 = "+num1+" and the value of num2 =  "+num2);
       
       //calculate
       newNum = num1 * 2 + num2;
       
       //output answer
       System.out.println("The value of newNum (num1 * 2 + num2) = "+newNum);
       
       //calculate
       newNum += SECRET;
       
       //output answer
       System.out.println("The updated value of newNum (newNum+SECRET) = "+newNum);
       
       //get input and assign to name
       System.out.print("Enter your last name: ");
       name = console.next();
       
       //get input and assign to hours worked
       System.out.print("Enter hours worked between 0 and 70: ");
       hoursWorked = console.nextDouble();
       
       //calculate
       wages = RATE * hoursWorked;
       
       //output the data
       System.out.println("\nName: "+name);
       System.out.println("Pay rate: $"+RATE);
       System.out.println("Hours Worked: "+hoursWorked);
       System.out.println("Salary: $"+wages);
   } //end main
} //end class
