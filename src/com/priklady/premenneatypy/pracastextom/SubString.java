package com.priklady.premenneatypy.pracastextom;

// Write a program which extracts the string value from specific range. As an input program should take
// the input string and two numbers beginning and end of range

import java.util.Scanner;

public class SubString {

    public static void main(String []args)
    {
        Scanner userInput = new Scanner(System.in);

        // Input string which will be extracted
        System.out.println("Input a string which will be extracted ");
        String strChain  = userInput.nextLine();
        System.out.println("Input first number in range ");
        int rangeBegin  = userInput.nextInt();
        System.out.println("Input second number in range ");
        int rangeEnd  = userInput.nextInt();

        System.out.println("String for extract the characters is: " + strChain);
        // Return extracted value
        System.out.println("Extracted value: " + strChain.substring(rangeBegin, rangeEnd));
    }
}
