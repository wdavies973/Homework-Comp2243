package com.cpjd.assignments.assignment2;

import java.util.*;

/*
 Author: Will Davies
 Date: 1-30-18
 Assignment: #2, PersonInfo.java
 Course: comp2243-31
 Description: Collects information about a person and outputs some basic info
*/
public class PersonInfo {
   public static void main(String[] args) {
       //declare variables, address is stored but not used
	   String firstName, lastName;
	   String address, city, state;
	   int age;
	   double annualIncome;
	   
	   // Setup for input
	   Scanner console = new Scanner(System.in);
	   
	   //get input
	   System.out.print("Please enter your first name: ");
	   firstName = console.nextLine();
	   System.out.print("Please enter your last name: ");
	   lastName = console.nextLine();
	   System.out.print("Please enter your street address: ");
	   address = console.nextLine();
	   System.out.print("Please enter your city: ");
	   city = console.nextLine();
	   System.out.print("Please enter your state: ");
	   state = console.nextLine();
	   System.out.print("Please enter your age: ");
	   age = console.nextInt();
	   System.out.print("Please enter your annual income: ");
	   annualIncome = console.nextDouble();
	   
	   //output
	   System.out.println("\nUser Information:");
	   System.out.println("Your name (last, first): "+lastName+", "+firstName);
	   System.out.println("Your Initials: "+firstName.substring(0, 1)+lastName.substring(0, 1));
	   System.out.println("Characters in city name: "+city.length());
	   System.out.println("User Location (uppercase): "+city.toUpperCase()+", "+state.toUpperCase());
	   System.out.println("User location (lowercase): "+city.toLowerCase()+", "+state.toLowerCase());
	   System.out.println("Your age: "+age);
	   System.out.println("Your annual income: $"+annualIncome);
   } //end main
} //end class
