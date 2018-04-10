package com.cpjd.assignments.assignment7;

import java.io.*;

/*
 Author: Will Davies
 Date: 4/10/2018
 Assignment: #7 CityClient.java
 Course: comp2243-31
 Description: Loads data from a text file and processes it
*/
public class CityClient {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\hg1112jc\\Downloads\\city_data.txt");

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(file));

            final int NUM_CITIES = 13;

            String[] names = new String[NUM_CITIES];
            int[] populations = new int[NUM_CITIES];
            double[] precipitations = new double[NUM_CITIES];

            String line;
            for(int i = 0; (line = fileReader.readLine()) != null; i++) {
                String[] tokens = line.split("\\s+");
                names[i] = tokens[0];
                populations[i] = Integer.parseInt(tokens[1]);
                precipitations[i] = Double.parseDouble(tokens[2]);
            }

            // Output the city information
            System.out.println("Name\t\tPopulation\t\tPrecipitation");
            for(int i = 0; i < names.length; i++) {
                System.out.println(names[i]+"\t\t"+populations[i]+"\t\t"+precipitations[i]);
            }

            // Output info
            System.out.println("The most populous city is "+names[getHighestPopulationIndex(populations)]+" with population "+populations[getHighestPopulationIndex(populations)]+".");
            System.out.println("The least populous city is "+names[getLowestPopulationIndex(populations)]+" with population "+populations[getLowestPopulationIndex(populations)]+".");

            System.out.println("The most precipitous city is "+names[getHighestPrecipitationIndex(precipitations)]+" with precipitation "+precipitations[getHighestPrecipitationIndex(precipitations)]+".");
            System.out.println("The least precipitous city is "+names[getLowestPrecipitationIndex(precipitations)]+" with precipitation "+precipitations[getLowestPrecipitationIndex(precipitations)]+".");
        } catch(Exception e) {
            System.out.println("An error occurred while reading the file.");
        }

    } // end main method

    private static int getLowestPrecipitationIndex(double[] array) {
        double lowest = array[0];
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < lowest){
                index = i;
                lowest = array[i];
            }
        }
        return index;
    }
    private static int getHighestPrecipitationIndex(double[] array) {
        double highest = array[0];
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > highest) {
                index = i;
                highest = array[i];
            }
        }
        return index;
    }
    private static int getLowestPopulationIndex(int[] array) {
        int lowest = array[0];
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < lowest) {
                index = i;
                lowest = array[i];
            }
        }
        return index;
    }
    private static int getHighestPopulationIndex(int[] array) {
        int highest = array[0];
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > highest) {
                index = i;
                highest = array[i];
            }
        }
        return index;
    }
} // end class
