package com.priklady.premenneatypy.premenneatypy;

public class Premenne {
    public static void main(String[] args) {

        // Celociselne premenne
        byte C1 = 20; // -128 az 127
        short C2 = 1523; // -32768 az 32767
        int C3 = 528; // -2147483648 az 2147483647
        long C4; // -9223372036854775808 az 9223372036854775807

        C4 = (C3 + C2 - C1) * 5; // matematicke operacie

        // Ciselnou premennu C4 nie je nutne pri vystupu na obrazovku prevadzat na text
        System.out.println("Vysledok: " + C4);

        // Celociselne delenie, ktore vracia zvysok po deleni
        System.out.println("Zvysok po deleni cisel 40/6 je " + 40 % 6);
        C1++; // k hodnote v C1 pricitame hodnotu 1
        System.out.println("Inkrementacia cisla C1++ " + C1);
        C1--; // od hodnoty v C1 odcitame hodnotu 1
        System.out.println("Dekrementacie cisla C1-- " + C1);

        // Desatinne premenne
        float D1; //deklaracia
        double D2;
        D1 = 258 / 3;
        System.out.println("Vysledok 258 / 3 = " + D1);
        D2 = 0.587 / 0.00003;
        System.out.println("Vysledok 0.587 / 0.00003 = " + D2);



        // Logicke premenne
        boolean B1 = true; // pravda
        boolean B2 = false; // nepravda
        System.out.println("Vysledok B1: " + B1);
        System.out.println("Vysledok B2: " + B2);

        // Znakove promenne
        char Z1 = 'A'; // znakovou premennu vlozime do jednoduchych uvodzoviek
        System.out.println("Zobraz Z1 ako znak:" + Z1);
        int ZZ1 = Z1;
        System.out.println("Zobraz Z1 ako cislo z ascii tabulky:" + ZZ1);
        char Z2 = 'J';
        int ZZ2 = Z1 + Z2;
        System.out.println("Vysledok suctu znakov Z1 + Z2: " + ZZ2 +
                " Co je soucet ascii cisel A=65 + J=74.");
        String ZZ3 = String.valueOf(Z1) + String.valueOf(Z2);
        System.out.println("Zobraz zretazenie Z1 + Z2: " + ZZ3);
        char Z3 ='\u0108'; //akceptuje aj kod ascii znakov
        System.out.println(Z3);


        // Textove premenne
        String Txt; // deklaracia bez zapisu hodnot
        String Txt1 = "Vložený text."; // deklaracia so zapisom hodnot
        Txt = "Dodatečně vložený text."; // priradenie textu do premennej
        String TxtVysledek = Txt + Txt1; // zretazenie textu
        System.out.println("Výsledný text: " + TxtVysledek);
    }
}
