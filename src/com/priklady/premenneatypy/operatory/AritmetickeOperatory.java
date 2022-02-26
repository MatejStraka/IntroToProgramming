package com.priklady.premenneatypy.operatory;


/*
+ operator scitani
- operator odcitani
* operator nasobeni
/ operator deleni
% operator zbytku
*/
public class AritmetickeOperatory {

    public static void main(String[] args)
    {
        int vysledek = 1 + 2; //vysledek je 3
        System.out.println(vysledek);

        vysledek = vysledek -1; //vysledek je 2
        System.out.println(vysledek);

        vysledek = vysledek * 2; //vysledek je 4
        System.out.println(vysledek);

        vysledek = vysledek /2; //vysledek je 2
        System.out.println(vysledek);

        vysledek = vysledek + 8; //vysledek je 10
        vysledek = vysledek % 7; //vysledek je 3
        System.out.println(vysledek);

    }
}
