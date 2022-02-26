package com.priklady.zakladyobjektovehoprogramovania;

// Write a program in which you create a class called Date, that class should contain three types of information:
// * day (int)
// * month (int)
// * year (int)
// Class should have a constructor which initializes instances of variables. We assume that values are correct.
// Create set and get method for each instanced variable
// Create method which displayDate - that displays day, month and year separated by forward slash (/)
// Write test app which show capabilities of created class

import java.util.Scanner;

class Date {
    private int day;
    private int month;
    private int year;
    public Date(int myMonth,int myDay, int myYear) {
        month = myMonth;
        day = myDay;
        year = myYear;
    }

    public void setDayDate(int myDay) {
        day = myDay;
    }

    public int getDayDate() {
        return month;
    }

    public void setMonthDate(int myMonth) {
        month = myMonth;
    }

    public int getMonthDate() {
        return month;
    }

    public void setYearDate(int myYear) {
        year = myYear;
    }

    public int getYearDate() {
        return year;
    }

    public void displayDate() {
        System.out.printf("%d/%d/%d", month,day,year);
    }
}

class DateTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Date myDate;
        myDate = new Date(9, 11, 1986);

        System.out.println("Enter The Month");
        int myMonth = userInput.nextInt();
        myDate.setMonthDate(myMonth);

        System.out.println("Enter the Date");
        int myDay = userInput.nextInt();
        myDate.setDayDate(myDay);

        System.out.println("Enter the Year");
        int myYear = userInput.nextInt();
        myDate.setYearDate(myYear);

        System.out.println("Day: " + myDate.getDayDate());
        System.out.println("Month: " + myDate.getMonthDate());
        System.out.println("Year: " + myDate.getYearDate());

        System.out.println("Print Completed Date");
        myDate.displayDate();
    }
}
