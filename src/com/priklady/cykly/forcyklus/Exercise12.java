package com.priklady.cykly.forcyklus;

// Write a program, which take an input from user - positive, integer number
// Then program should display all odd numbers not greater than number provided by user.

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // Initialize variables
        int number;
        int remainder;

        // Ask user for a positive integer number
        System.out.println("Input a number: ");
        number = userInput.nextInt();

        // Iteration in for loop
        for (int i = 1; i < number; i++) {
            remainder = i % 2;
            // Check condition
            if (remainder > 0) {
                System.out.println("Odd number " + i);
            }
        }
    }
}
