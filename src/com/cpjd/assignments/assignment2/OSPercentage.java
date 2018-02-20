package com.cpjd.assignments.assignment2;

import javax.swing.JOptionPane;
/*
 Author: Will Davies
 Date: 1-30-18
 Assignment: #2, OSPercentage.java
 Course: comp2243-31
 Description: Calculates the percentages of Mac, Linux, and Windows computers, with JOptionPane user interface
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
       
       //get input
       numMacs = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of computers with Mac OS: "));
       numLinux = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of computers with Linux OS: "));
       numWindows = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of computers with Windows OS: "));
       
       //calculate total and percentages
       total = numMacs + numLinux + numWindows;
       percentMac = (double)numMacs / total * 100;
       percentLinux = (double)numLinux / total * 100;
       percentWindows = (double)numWindows / total * 100;
       
       //output info
       JOptionPane.showMessageDialog(null, 
    		   "\nThe computer information:\n"
    		   + "Mac: "+numMacs
    		   + "\nLinux "+numLinux
    		   + "\nWindows: "+numWindows
    		   + "\nTotal Number of Computers: "+(int)total // cast to int because the only decimal digit var total will ever have is .0
    		   + "\nPercentage of Mac: "+percentMac
    		   + "\nPercentage of Linux: "+percentLinux
    		   + "\nPercentage of Windows"+percentWindows);
   } //end main
} //end class
