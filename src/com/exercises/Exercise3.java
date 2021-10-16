package com.exercises;
// Write code which initialize and declare variables of following types: int, long, double
// Assign them following values
// - int -> i = 100000000000000000000000
// - long -> l = -900000000000000000000000
// - double -> d = 100
// Check that code is build properly. What went wrong?
public class Exercise3 {

    public static void main(String[] args) {
       // Initialize variables, their types and values
       // int i = 100000000000000000000000;
       //long l = -900000000000000000000000;
        //correct
        int i = 1000;
        long l = -90000;
        //end correct
        double d = 100;

        // Print the variable values in the console
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
    }
}

// Answer - variables i and l are types int and long. Numeric values assigned to them comes from incorrect scopes.
// Rewrite the program, to build the code without any error and variables values will be displayed on standard output.
// Example solution
//    int i = 1000;
//    long l = -90000;
