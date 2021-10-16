package com.exercises;

// Write a program which convert temperature provided by user:
// - from Celsius to Fahrenheit (degrees in Fahrenheit = 1.8 * degrees in Celsius + 32)
// - from Fahrenheit to Celsius (degrees in Celsius = (degrees in Fahrenheit - 32 / 1.8))
// - from Celsius to Kelvin (degrees in Kelvin = degrees in Celsius + 273.15)
// - from Kelvin to Celsius (degrees in Celsius = degrees in Kelvin - 273.15)
// - from Kelvin to Fahrenheit (degrees in Fahrenheit = (degrees in Kelvin - 273.15) * 1.8 + 32)
// - from Fahrenheit to Kelvin (degrees in Kelvin = ((degrees in Fahrenheit - 32/1.8) + 273.15)
// Write every convert operation in separate method, which will be executed in main method.

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        Scanner readTemperature = new Scanner(System.in);

        // Get input user
        System.out.println("Input temperature value ");
        double temp = readTemperature.nextDouble();

        // Execute methods
        CtoF(temp);
        FtoC(temp);
        CtoK(temp);
        KtoC(temp);
        KtoF(temp);
        FtoK(temp);

    }

    // Celsius to Fahrenheit
    private static void CtoF(double temp) {
        System.out.println("Celsius to Fahrenheit " + 1.8 * temp + 32);
    }

    // Fahrenheit to Celsius
    private static void FtoC(double temp) {
        System.out.println("Fahrenheit to Celsius " + (temp - 32) / 1.8);
    }

    // Celsius to Kelvin
    private static void CtoK(double temp) {
        System.out.println("Celsius to Kelvin " + temp + 273.15);
    }

    // Kelvin to Celsius
    private static void KtoC(double temp) {
        System.out.println("Kelvin to Celsius " + (temp - 273.15));
    }

    // Kelvin to Fahrenheit
    private static void KtoF(double temp) {
        System.out.println("Kelvin to Fahrenheit " + (temp - 273.15)*1.8 + 32);
    }

    // Fahrenheit to Kelvin
    private static void FtoK(double temp) {
        System.out.println("Fahrenheit to Kelvin " + (temp - 32) / 1.8 + 273.15);
    }
}