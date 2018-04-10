package com.cpjd.assignments.assignment7;

import java.util.Random;

/*
 Author: Will Davies
 Date: 4/10/2018
 Assignment: #7 RandomNumbers.java
 Course: comp2243-31
 Description: Creates random numbers and uses some methods to print information about them
*/
public class RandomNumbers {

    public static void main(String[] args) {
        Random rand = new Random();

        int[] numbers = new int[45];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1001); // upper bound is 1001 since the upper bound is exclusive
        }

        System.out.println("Elements in an array of 45, organized by 15 per line: ");
        printArray(numbers);

        System.out.printf("\nMean: %.3f\n", computeMean(numbers));

        System.out.println("The index of the largest element: "+findLargestNum(numbers));

        System.out.println("Double-Digit Numbers: "+countTwoDigits(numbers));

        System.out.println("Triple-Digit Numbers: "+countThreeDigits(numbers));

        System.out.printf("Standard Deviation: %.3f", computeStandardDeviation(numbers));
    } // end main method

    // Prints the array with 15 elements per line
    private static void printArray(int[] array) {
        for(int i = 1; i <= array.length; i++) {
            System.out.print(array[i - 1] +" ");
            if(i % 15 == 0) System.out.println();
        }
    }

    // Computes the mean for the array of numbers
    private static double computeMean(int[] array) {
        double sum = 0;
        for(int num : array) sum += num;
        return sum / array.length;
    }

    // Returns the index of the largest number
    private static int findLargestNum(int[] array) {
        int largest = array[0];
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > largest) {
                largest = array[i];
                index = i;
            }
        }
        return index;
    }

    // Counts the number of two digit numbers
    private static int countTwoDigits(int[] array) {
        int count = 0;
        for(int num : array) {
            String string = String.valueOf(num);
            if(string.length() == 2) count++;
        }
        return count;
    }

    // Counts the number of three digit numbers
    private static int countThreeDigits(int[] array) {
        int count = 0;
        for(int num : array) {
            String string = String.valueOf(num);
            if(string.length() == 3) count++;
        }
        return count;
    }

    // Calculates the standard deviation for the array
    private static double computeStandardDeviation(int[] array) {
        double sum = 0;
        for(int num : array) sum += Math.pow(num - computeMean(array), 2);
        return Math.sqrt(sum / array.length);
    }

} // end class
