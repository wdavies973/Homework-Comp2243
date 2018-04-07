package com.cpjd.assignments.assignment6;

/*
 Author: Will Davies
 Date: 3/27/2018
 Assignment: #6 Trapezoid.java
 Course: comp2243-31
 Description: Demonstrates object orientated concepts
*/
public class Trapezoid {

    private double base1, base2, height;

    public Trapezoid() {}

    public Trapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double computeArea() {
        return (base1 + base2) * 0.5 * height;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "base1=" + base1 +
                ", base2=" + base2 +
                ", height=" + height +
                ", area="+computeArea() +
                '}';
    }

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
} // end class
