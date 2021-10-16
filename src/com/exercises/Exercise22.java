package com.exercises;

// Write a program which check that two strings are equal to each other. User provides the strings
// values using standard input. Program should return True if objects are equal, false otherwise.

import java.util.Scanner;

public class Exercise22 {
    public static void main(String []args)
    {
        Scanner stringToCompare = new Scanner(System.in);

        // Input string
        System.out.println("Input first string");
        String first = stringToCompare.nextLine();

        // Input string
        System.out.println("Input second string");
        String second  = stringToCompare.nextLine();

        // Comparing the strings
        System.out.println("Comparing " + first + " and " + second);
        boolean areEquals = first.equals(second);

        // Print comparison result
        System.out.println("Comparison result: " + areEquals);
    }
}
