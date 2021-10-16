package com.exercises;

// Write a program, which print multiplication table, based on range provided by user

import java.util.Scanner;

class Exercise14 {
    public static void main(String[] args) {

        Scanner readRange = new Scanner(System.in);

        // Initialize variables
        int a, b, c, d;

        System.out.println("Enter range of numbers to print their multiplication tables");

        a = readRange.nextInt();
        b = readRange.nextInt();

        for (c = a; c <= b; c++) {
            System.out.println("Multiplication table of " + c);

            for (d = 1; d <= 10; d++) {
                System.out.println(c + "*" + d + " = " + (c * d));
            }
        }
    }
}
