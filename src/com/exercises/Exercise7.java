package com.exercises;

// Write a program, which reads user input, but first print "What's your name?" on standard output.
// Name should be displayed on screen. If name equals "John Wick", then print "I see you working again John",
// otherwise print "Welcome, [xyz]", where [xyz] display the value provided by user

import java.util.Scanner;

public class Exercise7 {

    public static void main(String []args) {
        Scanner userInput = new Scanner(System.in);

        // Input string
        System.out.println("What's your name?");
        String name = userInput.nextLine();

        // Print variable on standard output
        System.out.println("Provided name " + name);

        // Check who are you
        if (name.equals("John Wick")) {
            System.out.println("I see you working again John");
        }
        else {
            System.out.println("Welcome, " + name);
        }
    }
}