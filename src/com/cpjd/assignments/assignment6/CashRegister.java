package com.cpjd.assignments.assignment6;

import java.util.Scanner;

/*
 Author: Will Davies
 Date: 3/27/2018
 Assignment: #6 CashRegister.java
 Course: comp2243-31
 Description: Client for part 3 of assignment 6
*/
public class CashRegister {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double totalPriceBeforeTax = 0;
        double totalPriceAfterTax = 0;

        while(true) {
            System.out.println("******************Cash Register**********************");
            System.out.println("1 --- Purchase");
            System.out.println("2 --- Check Out (Print Receipt)");
            System.out.println("3 --- Exit");
            System.out.println("******************Cash Register**********************");
            System.out.print("Select an option: ");

            int option = console.nextInt();

            switch (option) {
                case 1:
                    System.out.print("\nEnter product name: ");
                    String productName = console.next();
                    System.out.print("\nEnter product unit price: ");
                    double unitPrice = console.nextDouble();
                    System.out.print("\nEnter units to purchase: ");
                    int unitsToPurchase = console.nextInt();
                    Product2 product = new Product2(productName, unitPrice, unitsToPurchase);
                    System.out.println("\n"+product); // toString() called automatically
                    totalPriceAfterTax += product.computePriceBeforeTax();
                    totalPriceBeforeTax += product.computePriceBeforeTax();
                    break;
                case 2:
                    System.out.println("-------------------------- RECEIPT -----------------------------");
                    System.out.printf("Total purchase price before tax: %.2f\n", totalPriceBeforeTax);
                    System.out.println("Sales Tax Rate: "+Product2.SALES_TAX);
                    System.out.printf("Total purchase price after tax: %.2f", totalPriceAfterTax);
                    // Reset variables for next customer
                    totalPriceAfterTax = 0;
                    totalPriceBeforeTax = 0;

                default:
                    return; // stop the program
            }
        }
    } // end main method

    // Resize the array and adds a new item, OLD METHOD, professor didn't like this
    private static Product2[] addProduct(Product2[] products, Product2 newProduct) {
        Product2[] temp = new Product2[products.length + 1];
        for(int i = 0; i < products.length; i++) {
            temp[i] = products[i];
        }
        temp[temp.length - 1] = newProduct;
        return temp;
    }
} // end class
