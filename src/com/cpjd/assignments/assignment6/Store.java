package com.cpjd.assignments.assignment6;

import java.util.Scanner;

/*
 Author: Will Davies
 Date: 3/27/2018
 Assignment: #6 Store.java
 Course: comp2243-31
 Description: Client app for part 2 of assignment 6
*/
public class Store {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int productNumber, unitsSold;
        String productName;
        double unitPrice;

        System.out.print("Enter product number: ");
        productNumber = console.nextInt();
        System.out.println("\nEnter product name: ");
        productName = console.next();
        System.out.print("Enter unit price: $");
        unitPrice = console.nextDouble();
        System.out.print("\nEnter units sold: ");
        unitsSold = console.nextInt();

        // Create object
        Product product = new Product(productNumber, productName, unitPrice, unitsSold);

        // Solve the problem
        System.out.printf("Purchase price: %.2f\n", product.computePurchasePrice());
        System.out.println("Sales information: "+product); // toString() automatically called
    } // end main method
} // end class
