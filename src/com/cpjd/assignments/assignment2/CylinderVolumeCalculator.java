package com.cpjd.assignments.assignment2;

import javax.swing.JOptionPane;
/*
 Author: Will Davies
 Date: 1-30-18
 Assignment: #2, CylinderVolumeCalculator.java
 Course: comp2243-31
 Description: Calculates the volume of a cylinder using JOptionPanes for input and ouput
*/
public class CylinderVolumeCalculator {
   public static void main(String[] args) {
       //declare variables
       double radius;
       double height;
       double surfaceArea;
       double volume;
       
       //get input
       radius = Double.parseDouble(JOptionPane.showInputDialog("Enter cylinder radius: "));
       height = Double.parseDouble(JOptionPane.showInputDialog("Enter cylinder height: "));
       
       // perform calculations
       volume = (Math.PI * radius * radius) * height;
       surfaceArea = (Math.PI * radius * radius * 2) + (Math.PI * radius * 2 * height);
       
       // format the results to two decimal places
       String result = String.format("Volume: %.2f\nSurface area: %.2f", volume, surfaceArea);
       
       //output info
       JOptionPane.showMessageDialog(null,
    		   result, "Results", JOptionPane.INFORMATION_MESSAGE);
   } //end main
} //end class
