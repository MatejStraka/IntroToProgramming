package com.priklady.riadenietoku.prikazSwitch;

public class Enums {
//Napiste program ktory na obrazovku vypise ci je vikend, pondelok, piatok alebo iba obycajny pracovny den
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
