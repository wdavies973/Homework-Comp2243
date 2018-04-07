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

        Product2[] products = new Product2[0];

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
                    products = addProduct(products, product);
                    break;
                case 2:
                    System.out.println("-------------------------- RECEIPT -----------------------------");
                    double totalBeforeTax = 0;
                    double totalAfterTax = 0;
                    for(Product2 product2 : products) {
                        totalBeforeTax +=  product2.computePriceBeforeTax();
                        totalAfterTax += product2.computePriceAfterTax();
                        System.out.println(product2);
                    }
                    System.out.printf("Total purchase price before tax: %.2f\n", totalBeforeTax);
                    System.out.println("Sales Tax Rate: "+Product2.SALES_TAX);
                    System.out.printf("Total purchase price after tax: %.2f", totalAfterTax);
                    return; // stop the program
                default:
                    return; // stop the program
            }
        }

    } // end main method

    // Resize the array and adds a new item
    private static Product2[] addProduct(Product2[] products, Product2 newProduct) {
        Product2[] temp = new Product2[products.length + 1];
        for(int i = 0; i < products.length; i++) {
            temp[i] = products[i];
        }
        temp[temp.length - 1] = newProduct;
        return temp;
    }
} // end class
