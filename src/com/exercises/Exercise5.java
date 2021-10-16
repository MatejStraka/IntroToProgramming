package com.exercises;
// Write a code, which takes two integer number as an input and then perform math operations
// - addition
// - subtraction
// - multiplication
// - division
// - raising to a power (in that case first argument will be a number raised to power, second argument will be a power number.
// for power operation you can use the "pow" method from Math class - java.lang.
// The result of operation should be assigned to newly initialized variable of correct type.
// Result should be displayed in correct way on the screen
// - addition -> "a = A, b = B, results is C"
// - subtraction -> "a = A, b = B, results is C"
// - multiplication -> "a = A, b = B, results is C"
// - division -> "a = A, b = B, results is C"
// - raising to a power -> "a = A, raised to power B, gives us C"

// Importing libraries
import java.lang.Math;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Read first integer value
        System.out.println("Input first integer number");
        int a = userInput.nextInt();

        // Read second integer value
        System.out.println("Input second integer number");
        int b = userInput.nextInt();

        // addition
        double addition_result = a + b;
        System.out.println("a = " + a + ", b = " + b + ", result is  " + addition_result);

        // subtraction
        double subtraction_result = a - b;
        System.out.println("a = " + a + ", b = " + b + ", result is " + subtraction_result);

        // multiplication
        double multiplication_result = a * b;
        System.out.println("a = " + a + ", b = " + b + ", result is " + multiplication_result);

        // division
        double division_result = a / b;
        System.out.println("a = " + a + ", b = " + b + ", result is " + division_result);

        // raising to a power
        double power_result = Math.pow(a, b);
        System.out.println("a = " + a + ", raised to power " + b + ", gives us " + power_result);
    }
}

