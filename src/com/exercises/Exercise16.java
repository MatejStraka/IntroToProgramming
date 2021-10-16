package com.exercises;

//The online store offers installment sale. Write a program calculating the monthly installment for the purchased tower.
// Input data for the program are:
//
//        * the price of the goods (from $ 100 to $ 10,000)
//        * number of installments (from 6 to 48).
//
//        The loan bears interest depending on the number of installments:
//
//        * from 6-12 is 2.5%,
//        * from 13-24 is 5%,
//        * from 25-48 is 10%.
//
//        The user indicates the number of installments and the amount lent.

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // Initialize variables
        int installmentNumber;
        double loanAmount = 1000;
        double interestRate = 0;
        double monthlyInstallment;

        // Get the input from user
        System.out.println("Input Installment number: ");
        installmentNumber = userInput.nextInt();

        System.out.println("Input loan amount: ");
        loanAmount = userInput.nextInt();

        // Count installment number and interest rate
        if ((installmentNumber >= 6) && (installmentNumber <=12)){
            interestRate = 0.025;
        } else if ((installmentNumber >= 13) && (installmentNumber <=24)){
            interestRate = 0.05;
        } else if ((installmentNumber >= 25) && (installmentNumber <=48)){
            interestRate = 0.1;
        }

        // Count montly installment rate and print it to standard output
        monthlyInstallment = (loanAmount / installmentNumber) + (loanAmount/installmentNumber) * interestRate;
        System.out.println(monthlyInstallment);
    }
}
