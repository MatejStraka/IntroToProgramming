package com.priklady.cykly.whilecyklus;

// Write a program, which take an input from user
// Program should ask for password until user provide the correct password
// In case user provide correct password, it should print "Correct password"
// otherwise, password should be displayed on screen and user should have possibility to input
// password again.

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner readPassword = new Scanner(System.in);

        // Initialize variables
        String password;
        String correctPassword = "secretpassword";

        // Create while loop, to check the password
        while (true) {
            // Input password
            System.out.println("Password please: ");
            password = readPassword.nextLine();

            // Check that provided password is correct
            if (password.equals(correctPassword)) {
                System.out.println("Correct password");
                break;
            } else {
                System.out.println("Incorrect password");
            }
        }
    }
}
