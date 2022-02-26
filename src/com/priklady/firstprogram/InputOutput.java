package com.priklady.firstprogram;

// Import kniznice pre pracu so standardnym vstupom
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args){

        //vytvori sa novy objekt typu Scanner pre pracu so standardnym vstupom
        Scanner userInput = new Scanner(System.in);

        // Spyta sa na meno
        System.out.println("What is your name?");
        String name = userInput.nextLine();

        // Vypise meno na standardny vystup
        System.out.println("Hello, " + name);
    }
}