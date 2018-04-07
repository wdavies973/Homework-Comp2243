package com.cpjd.assignments.assignment6;

/*
 Author: Will Davies
 Date: 3/27/2018
 Assignment: #6 Product.java
 Course: comp2243-31
 Description: Demonstrates object orientated concepts
*/
public class Product {

    private int productNumber;
    private String productName;
    private double unitPrice;
    private int unitsSold;

    public Product() {}

    public Product(int productNumber, String productName, double unitPrice, int unitsSold) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitsSold = unitsSold;
    }

    public double computePurchasePrice() {
        return unitPrice * unitsSold;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", unitsSold=" + unitsSold +
                ", purchasePrice="+computePurchasePrice() +
                '}';
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
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

    public int getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }
} // end class
