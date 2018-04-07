package com.cpjd.assignments.assignment6;

/*
 Author: Will Davies
 Date: 3/27/2018
 Assignment: #6 Product2.java
 Course: comp2243-31
 Description: Product object for part 3, named it product2 since Product name is used by a different assignment requirement
*/
public class Product2 {

    private String productName;

    private double unitPrice;

    private int unitsToPurchase;

    public static final double SALES_TAX = 0.0675;

    public Product2() {}

    public Product2(String productName, double unitPrice, int unitsToPurchase) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitsToPurchase = unitsToPurchase;

        if(this.unitPrice <= 0) {
            System.out.println("Unit price invalid. Defaulting to 0.");
            this.unitPrice = 0;
        }

        if(this.unitsToPurchase <= 0) {
            System.out.println("Units to purchase invalid. Defaulting to 0.");
            this.unitsToPurchase = 0;
        }
    }

    public double computePriceBeforeTax() {
        return unitsToPurchase * unitPrice;
    }

    public double computePriceAfterTax() {
        return computePriceBeforeTax() * (1 + SALES_TAX);
    }

    @Override
    public String toString() {
        return "Product2{" +
                "productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", unitsToPurchase=" + unitsToPurchase +
                ", price before tax=$" + computePriceBeforeTax() +
                ", price after tax=$" + computePriceAfterTax() +
                '}';
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
        if(unitPrice <= 0) {
            System.out.println("Unit price is invalid. Defaulting to 0.");
            unitPrice = 0;
        }

        this.unitPrice = unitPrice;
    }

    public int getUnitsToPurchase() {
        return unitsToPurchase;
    }

    public void setUnitsToPurchase(int unitsToPurchase) {
        if(unitsToPurchase <= 0) {
            System.out.println("Units to purchase is invalid. Defaulting to 0.");
            unitsToPurchase = 0;
        }
        this.unitsToPurchase = unitsToPurchase;
    }
} // end class
