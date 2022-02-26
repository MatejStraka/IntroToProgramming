package com.priklady.riadenietoku;

// Write a calculator which as an input takes
// - two numbers
// - math operator (allowed +, -, *, /)
// And display the result of operation on standard output

import java.util.Scanner;

public class Kalkulacka {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        // nextDouble() reads the next double from the keyboard
        double first = userInput.nextDouble();
        double second = userInput.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = userInput.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}
