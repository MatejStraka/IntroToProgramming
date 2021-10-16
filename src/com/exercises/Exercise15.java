package com.exercises;

// Write a program, which takes a number from user and display it reversed
// i.e : for 1234, program should return 4321

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {

        Scanner readNumber = new Scanner(System.in);

        // Initialize variables
        int num;
        int reversed = 0;

        // Get the number from user
        System.out.println("What number should I reverse?");
        num = readNumber.nextInt();

        // Reverse the number using while loop
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        // Reverse the number using for loop
//        for(;num != 0; num /= 10) {
//            int digit = num % 10;
//            reversed = reversed * 10 + digit;
//        }

        System.out.println("Reversed number: " + reversed);
    }
}
