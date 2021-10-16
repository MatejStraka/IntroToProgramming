package com.exercises;

// Write a code, which take integer number from user and print it to standard output.
// Following message should be displayed "User input X" - where X is the value of number provided by user
// Expect that user should input only integer values
// For handle the user input, use the Scanner library.
// Test how the program behaves for data types other than integer.

// Importing libraries
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        // Read integer type value
        // Create Scanner class object with param System.in
        Scanner userInput = new Scanner(System.in);

        // Inform user what action need to be taken
        System.out.println("Input integer number");
        int a = userInput.nextInt(); // reading the input from keyboard
        // in this specific case integer value

        // Print text and variable value
        System.out.println("User input value " + a);
    }
}

// If you want to program handle the other data types, you have to change the type of input provided by user
// int a = in.nextInt();
// If user input value with type that is not handled, exception will be raised
// Exception in thread "main" java.util.InputMismatchException
//        at java.util.Scanner.throwFor(Scanner.java:864)
//        at java.util.Scanner.next(Scanner.java:1485)
//        at java.util.Scanner.nextInt(Scanner.java:2117)
//        at java.util.Scanner.nextInt(Scanner.java:2076)
//        at Excercise4.main(Excercise4.java:21)