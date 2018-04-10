package com.cpjd.assignments.assignment7;

import java.util.Scanner;

/*
 Author: Will Davies
 Date: 4/10/2018
 Assignment: #7 PackageClient.java
 Course: comp2243-31
 Description: Collects information about 10 packages from the user and outputs some information about them
*/
public class PackageClient {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] names = new String[10];
        double[] weights = new double[10];

        // Get input
        for(int i = 0; i < 10; i++) {
            System.out.print("Enter package #"+(i + 1)+" name: ");
            names[i] = console.next();
            System.out.print("Enter package #"+(i + 1)+" weight: ");
            weights[i] = console.nextDouble();
            if(weights[i] < 0) {
                System.out.println("Invalid weight. Try again.");
                i--;
            }
        }

        // output each package's name and weight
        for(int i = 1; i <= 10; i++) {
            System.out.println("Package #"+i+" is called "+names[i - 1]+" and weighs "+weights[i - 1]);
        }

        // find the highest weight and name of package with highest weight
        double highestWeight = weights[0];
        int index = 0;
        for(int i = 0; i < weights.length; i++) {
            if(weights[i] > highestWeight) {
                highestWeight = weights[i];
                index = 0;
            }
        }
        System.out.println("Package #"+(index + 1)+" ("+names[index]+") has the highest weight: "+weights[index]+".");

        // Output average weight
        double avg = 0;
        for(double weight : weights) avg += weight;
        avg /= weights.length;
        System.out.println("Average weight: "+avg);

        // Output names of all packages whose weight is less than average
        for(int i = 0; i < weights.length; i++) {
            if(weights[i] < avg) System.out.println(names[i]+"'s weight is less than average ("+weights[i]+")");
        }

        // Output names of all packages whose weight is greater than average
        for(int i = 0; i < weights.length; i++) {
            if(weights[i] >= avg) System.out.println(names[i]+"'s weight is greater than or equal to the average ("+weights[i]+")");
        }
    } // end main method
} // end class
