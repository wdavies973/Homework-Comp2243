package com.cpjd.assignments.assignment6;

/*
 Author: Will Davies
 Date: 3/27/2018
 Assignment: #6 Circle.java
 Course: comp2243-31
 Description: Demonstrates object orientated concepts
*/
public class Circle {

    private double radius;

    public Circle() {
        this(0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double computeCircumference() {
        return Math.PI * 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle" + "radius=" + radius + ", area="+computeArea();
    }
} // end class
