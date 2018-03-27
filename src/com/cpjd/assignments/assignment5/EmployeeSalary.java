package com.cpjd.assignments.assignment5;

import java.io.*;
import java.util.Scanner;

/*
 Author: Will Davies
 Date: 3/13/2018
 Assignment: #5 EmployeeSalary.java
 Course: comp2247
 Description: Reads and parses a text file, runs some calculations, and creates an export file
*/
public class EmployeeSalary {

    public static void main(String[] args) {
        // Setup the scanner for getting file paths
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the file path for \"employeeData.txt\": ");
        File employeeData = new File(console.next());

        // Process the file
        try {
            // There are 6 employees, so pre-allocate the array for 6
            String[] output = new String[6];

            FileInputStream fis = new FileInputStream(employeeData);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
            String line;
            for(int i = 0; (line = reader.readLine()) != null; i++) {
                String[] tokens = line.split("\\s+"); // split the strings into 4 tokens for each line (first, last, salary, rate)
                // Calculate the new salary
                double newSalary = Double.parseDouble(tokens[2]);
                newSalary = newSalary * (1 + Double.parseDouble(tokens[3]) / 100);
                output[i] = tokens[0]+"\t"+tokens[1]+"\t"+tokens[2]+"\t"+tokens[3]+"\t"+newSalary;
            }

            // Output the new file in the same directory as the current file
            // Write to the same file, using the FileOutputStream
            fis.close();
            PrintWriter writer = new PrintWriter(new FileOutputStream(employeeData));
            for(String data : output) writer.println(data);
            writer.close();
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("An error occurred while reading the data file.");
        }


    } // end main method
} // end class
