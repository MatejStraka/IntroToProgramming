package com.priklady.cykly.forcyklus;

// Write a program which checks that number/string input by user is a palindrome
// Palindrome description:
// Follow with hints:
// * Get the number to check for palindrome
// * Hold the number in temporary variable
// * Reverse the number
// * Compare the temporary number with reversed number
// * If both numbers are same, print "palindrome number"
// * Else print "not palindrome number"

import java.util.Scanner;

class Palindrom
{
    public static void main(String []args)
    {
        // Objects of String class
        String original;
        StringBuilder reverse = new StringBuilder();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = userInput.nextLine();

        // Check length
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse.append(original.charAt(i));
        if (original.equals(reverse.toString()))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
}
