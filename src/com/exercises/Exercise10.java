package com.exercises;

// Modify code from previous exercise, user should have possibility to input number of messages displayed on the screen

import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner messagesCount = new Scanner(System.in);

        // Read input from user
        System.out.println("How many messages? ");
        int last = messagesCount.nextInt();

        for (int i = 0; i < last; i++) {
            System.out.println("This is message in loop");
        }
    }
}
