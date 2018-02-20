package com.cpjd.assignments.assignment1;

/*
Author: Will Davies
Date: 1-16-2018
Course: comp2243-31
Assignment: #1, FixErrorsAndFormat.java
Description: Homework assignment 1 file with errors to fix
*/
public class FixErrorsAndFormat
{
   public static void main(String [] args) {
       //output
       System.out.println("Welcome to RCTC");
       System.out.println("This program has many bugs ");
       System.out.println("7+8 = " + (7+8));
       // declare variables
       int number1, number2;
       int area;
       //assign a value
       number1 = 23;
       number2 = 4;
       //calculate area
       area = number1 * number2;
       //output
       System.out.println("Number 1 = "+number1+", Number 2 = "+number2);
       System.out.println("Area is " + area);
       System.out.println("Sum is " + (number1 + number2));
       System.out.println("Quotient is " + (number1 / number2));
       System.out.println("Remainder is " + (number1 % number2 ));
   }//end main
}//end class
