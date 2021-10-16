package com.exercises;
// Write a program, which reads user input, but first print "Password please" on standard output.
// Password should be displayed on screen. If password equals to = 'secret' then print "Welcome to secret place",
// otherwise end the program.

// Importing libraries
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        // Input password
        System.out.println("Password please ");
        String s = userInput.nextLine();

        // Print password on standard output
        System.out.println("Provided password is " + s);

        // Check the password input by user
        if (s.equals("secret")) {
            System.out.println("Welcome to secret place.");
        }
    }
}