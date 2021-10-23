package com.examples.day3;

public class Premenne {
    public static void main(String[] args) {
        // Textové proměnné.
        String Txt; // deklarace bez zápisu hodnot
        String Txt1 = "Vložený text."; // deklarace se zápisem hodnot
        Txt = "Dodatečně vložený text."; // přiřazení textu do proměnné
        String TxtVysledek = Txt + Txt1; // řetězení textu
        System.out.println("Výsledný text: " + TxtVysledek);

        // Celočíselné proměnné.
        byte C1 = 20; // -128 až 127
        short C2 = 1523; // -32768 až 32767
        int C3 = 528; // -2147483648 až 2147483647
        long C4; // -9223372036854775808 až 9223372036854775807
        C4 = (C3 + C2 - C1) * 5; // matematické operace
        // Číselnou proměnnou C4 není nutno při výstupu na obrazovku
        // převádět na text.
        System.out.println("Výsledek:" + C4);
        // Celočíselné dělení, které vrací zbytek po dělení
        System.out.println("Zbytek po dělení čísel 40/6 ..." + 40 % 6);
        C1++; // k hodnotě v C1 připočteme hodnotu 1
        System.out.println("Inkrementace čísla C1++ " + C1);
        C1--; // od hodnoty v C1 odečteme hodnotu 1
        System.out.println("Dekrementace čísla C1-- " + C1);

        // Desetinné proměnné
        float D1;
        double D2;
        D1 = 258 / 3;
        System.out.println("Výsledek 258 / 3 = " + D1);
        D2 = 0.587 / 0.00003;
        System.out.println("Výsledek 0.587 / 0.00003 = " + D2);

        // Logické proměnné
        boolean B1 = true; // pravda
        boolean B2 = false; // nepravda
        System.out.println("Výsledek B1: " + B1);
        System.out.println("Výsledek B2: " + B2);

        // Znakové proměnné
        char Z1 = 'A'; // znakovou proměnnou vložíme do jednoduchých uvozovek
        System.out.println("Zobraz Z1 jako znak:" + Z1);
        int ZZ1 = Z1;
        System.out.println("Zobraz Z1 jako číslo z ascii tabulky:" + ZZ1);
        char Z2 = 'J';
        int ZZ2 = Z1 + Z2;
        System.out.println("Výsledek součtu znaků Z1 + Z2: " + ZZ2 +
                " Což je součet ascii čísel A=65 + J=74.");
        String ZZ3 = String.valueOf(Z1) + String.valueOf(Z2);
        System.out.println("Zobraz zřetězení Z1 + Z2: " + ZZ3);
    }
}
