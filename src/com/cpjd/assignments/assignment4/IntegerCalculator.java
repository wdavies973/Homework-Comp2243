package com.cpjd.assignments.assignment4;

import java.util.Scanner;

/*
 Author: Will Davies
 Date: 2/20/2018
 Assignment: #4 IntegerCalculator.java
 Course: comp2243-31
 Description: Prompts user for two integers and does some calculations with them
*/
public class IntegerCalculator {

    public static void main(String[] args) {
        // create console
        Scanner console = new Scanner(System.in);

        // declare variables
        int n1;
        int n2;

        // get input
        System.out.println("Enter two numbers (First number must be less than the second number)\n\n");
        System.out.print("Enter the first number: ");
        n1 = console.nextInt();
        System.out.print("Enter the second number: ");
        n2 = console.nextInt();

        // convert to positive numbers
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);

        // swap numbers
        if(n1 > n2) {
            int temp = n2;
            n2 = n1;
            n1 = temp;
        }

        // Output all even numbers
        System.out.println("Even integers between "+n1+" and "+n2+" are:");
        int counter = n1 - 1; // the counter needs to be one less because the loop will add one before executing it, this ensures n1 is considered
        while((counter++) < n2) {
            if(counter % 2 == 0) System.out.print(counter + " ");
        }

        // Find sum of all odd numbers and squares of odd numbers
        counter = n1 - 1;
        int sum = 0;
        int sumOfSquares = 0;
        while((counter++) < n2) {
            if(counter % 2 != 0) {
                sum += counter;
                sumOfSquares += Math.pow(counter, 2);
            }
        }
        System.out.println("\n\nSum of odd integers between "+n1+" and "+n2+" = "+sum);
        System.out.println("\nSum of the squares of odd integers between "+n1+" and "+n2+" = "+sumOfSquares);

        // Lower case letters are
        char letter = 'a';
        System.out.print("\nLower case letters are: a ");
        while((letter++) != 'z') {
            System.out.print(letter + " ");
        }
    } // end main method
} // end class
