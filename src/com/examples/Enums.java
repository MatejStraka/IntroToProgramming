package com.examples;

public class Enums {

    public static void main(String[] args) {
        enum Days {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
        }
        System.out.println(Days.MONDAY);

        Days myVar=Days.SATURDAY;
        switch(myVar) {
            case MONDAY:
                System.out.println("First day of the week");
                break;
            case FRIDAY:
                System.out.println("It is Friday");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!!!");
                break;
            default:
                System.out.println("Day");
                break;
        }

    }
}
