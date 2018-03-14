package com.cpjd.assignments.miscellaneous;

/*
 Author: Will Davies
 Date: 2/20/2018
 Assignment: # LockerProblem.java
 Course: comp2243-31
 Description: 
*/
public class LockerProblem {

    public static void main(String[] args) {

        int x = 2 ;
        int y = 5;
        switch (x) {
            case 1:
                y++;
                break;
            case 2:
                y = y - 2;
            case 3:
                y = y + 10;
                break;
            case 4:
                y = y + 3;
                break;
        }
        System.out.println(y);


        if(true) return;

        // false = closed, true = open
        boolean[] lockers = new boolean[1000];
        for(int i = 0; i < lockers.length; i++) {
            // Open all lockers
            lockers[i] = true;
            // If even, close it
            if(i % 2 == 0) lockers[i] = false;
        }

        for(int i = 0; i < lockers.length; i++) {
            for(int j = 1; j < 1000; j++) {
                if(i % j == 0) lockers[i] = !lockers[i];
            }
        }


        // output locker numbers of open lockers
        for(int i = 0; i < lockers.length; i++) {
            if(lockers[i]) System.out.println("Locker "+(i + 1)+" is open.");
        }

        // Finalized solution
        int numFactors;
        for(int i = 1; i <= 1000; i++) {
            numFactors = 0;
            for(int j = 1; j <= i; j++) { // check factors (only have to go half way)
                if(i % j == 0) {
                    numFactors++;
                }
            }

            if(numFactors % 2 == 0) {
                // close
            } else {
                // open
            }

        }



    } // end main method
} // end class
