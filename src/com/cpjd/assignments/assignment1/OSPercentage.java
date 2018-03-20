package com.cpjd.assignments.assignment1;

import java.util.Scanner;
/*
 Author: Will Davies
 Date: 1-16-18
 Assignment: #1, OSPercentage.java
 Course: comp2243-31
 Description: Calculates the percentages of Mac, Linux, and Windows computers
*/
public class OSPercentage {
   public static void main(String[] args) {
       //declare variables
       int total;
       double percentMac;
       double percentLinux;
       double percentWindows;
       int numMacs;
       int numLinux;
       int numWindows;
   
       //create a scanner object
       Scanner console = new Scanner(System.in);
       
       //output
       System.out.println("Operating System Usage Program");
       
       //get input
       System.out.print("Enter the number of computers with Mac OS: ");
       numMacs = console.nextInt();
       System.out.print("Enter the number of computers with Linux OS: ");
       numLinux = console.nextInt();
       System.out.print("Enter the number of computers with Windows OS: ");
       numWindows = console.nextInt();
       
       //calculate total and percentages
       // although total can only be an integer, it will mess up the calculates below if it's not stored as a double
       total = numMacs + numLinux + numWindows;
       percentMac = (double)numMacs / total * 100;
       percentLinux = (double)numLinux / total * 100;
       percentWindows = (double)numWindows / total * 100;
       
       //output info
       System.out.println("\nThe computer information:\n***********************************");
       System.out.println("Mac: "+numMacs);
       System.out.println("Linux: "+numLinux);
       System.out.println("Windows: "+numWindows);
       // cast total to an int because total num of computers can never be an decimal
       System.out.println("\nTotal Number of Computers: "+(int)total+"\n");
       System.out.println("Percentage of Mac: "+percentMac+"\n");
       System.out.println("Percentage of Linux: "+percentLinux+"\n");
       System.out.println("Percentage of Windows: "+percentWindows+"\n");
   } //end main
} //end class
