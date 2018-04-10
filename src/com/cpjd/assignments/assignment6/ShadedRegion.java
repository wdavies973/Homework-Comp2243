package com.cpjd.assignments.assignment6;

import java.util.Scanner;

/*
 Author: Will Davies
 Date: 3/27/2018
 Assignment: #6 ShadedRegion.java
 Course: comp2243-31
 Description: Client for circle / trapezoid problem
*/
public class ShadedRegion {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double radius;
        double base1;
        double base2;
        double height;

        System.out.print("Enter circle radius: ");
        radius = console.nextDouble();
        System.out.print("\nEnter trapezoid base1: ");
        base1 = console.nextDouble();
        System.out.print("\nEnter trapezoid base2: ");
        base2 = console.nextDouble();
        System.out.print("\nEnter trapezoid height: ");
        height = console.nextDouble();

        // Create objects
        Circle circle = new Circle(radius);
        Trapezoid trapezoid = new Trapezoid(base1, base2, height);

        // Solve the problem
        System.out.printf("Area of shaded region: %.2f", (trapezoid.computeArea() - circle.computeArea()));
    } // end main
} // end class
