package com.priklady.zakladyobjektovehoprogramovania;

// Create class SavingsAccount. Use static variable called annualInterestRate to store the annual interest rate for all
// account holders. Each object of the class contains a private instance variable savingsBalance which indicate the
// amount the saver currently has on deposit. Provide method calculateMonthlyInterest to calculate the monthly
// interests by multiplying the savingsBalance by annualInterestRate divided by 12 this interest should be added to
// savingsBalance. Provide a static method modifyInterestRate that sets the annualInterestRate to a new value.
// Write test app which  test class SavingsAccount. Create two instances of savingsAccount objects, saver1 and saver2,
// with balances of $1000.00 and $2000.00. Set annualInterestRate to 4%, then calculate the monthly
// interest and print the new balances for both savers. Then set the annualInterestRate to 5%, calculate the next
// month’s interest and print the new balances for both savers

class SavingsAccount {
    public static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount() {
        annualInterestRate = 0.0;
        savingsBalance = 0.0;
    }

    public SavingsAccount(double intRate, double savBal) {
        annualInterestRate = intRate;
        savingsBalance = savBal;
    }

    public double calculateMonthlyInterest() {
        double intRate = (savingsBalance * annualInterestRate/12);
        savingsBalance = savingsBalance + intRate;
        return intRate;
    }

    public static void modifyInterestRate(double newInteresRate) {
        annualInterestRate = newInteresRate;
    }

    public void setSavingsBalance(double newBal) {
        savingsBalance = newBal;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
}

class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        saver1.setSavingsBalance(1000.00);
        saver2.setSavingsBalance(2000.00);
        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("New Balance for Saver1= " + saver1.getSavingsBalance());
        System.out.println("New Balance for Saver2= " + saver2.getSavingsBalance());
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("New Balance for Saver1= " + saver1.getSavingsBalance());
        System.out.println("New Balance for Saver2= " + saver2.getSavingsBalance());

    }
}
