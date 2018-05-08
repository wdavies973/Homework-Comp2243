
package com.cpjd.assignments.assignment8;
/*
 Author: Will Davies
 Date: 5/8/2018
 Assignment: #8 Product.java
 Course: comp2243-31
 Description: This is a data model to help clean up the CashRegisterGUI.java class
*/
public class Product {
    
    private String productName;
    private double unitPrice;
    private int quantity;
    
    public Product() {}
    
    public Product(String productName, double unitPrice, int quantity) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return "Product name: "+productName+" Unit price: $"+unitPrice+" Quantity: "+quantity;
    }
    
    public double calculatePrice() {
        return unitPrice * (double)quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
    
}
