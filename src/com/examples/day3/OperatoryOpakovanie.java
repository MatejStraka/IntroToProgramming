package com.examples.day3;

public class OperatoryOpakovanie {
    public static void main(String[] args) {
        // Dělení dvou čísel a zbytek po dělení
        // dělíme dvě celá čísla bez použití přetypování - výsledek je celé číslo
        System.out.println("Dělení dvou celých čísel 10 / 3 = " + 10 / 3);
        // dělíme dvě celá čísla s použití přetypování - výsledek je desetinné číslo
        System.out.println("Dělení dvou celých čísel s přetypováním 10 / 3 = " + ((double)10 / 3));
        // dělíme dvě celá čísla s použití přetypování - výsledek je desetinné číslo
        System.out.println("Dělení dvou reálných čísel 10.25 / 3.5 = " + 10.25/3.5);
        //dělíme dvě celá čísla, operátor % vypočte zbytek po dělení jako celé číslo
        System.out.println("Zbytek po dělení dvou čísel 10 / 3 = " + 10 % 3);

        // Různý zápis přiřazení
        System.out.println("x,y,z = 10");
        int x = 10;
        x = x + 5;
        System.out.println("x=x+5 : "+ x);
        int y = 10;
        y +=5; // y = y + 5
        System.out.println("y+=5 : "+ y);
        int z = 10;
        z *=5; // z = z * 5
        System.out.println("z*=5 : "+ z);

        // Inkrementace a dekrementace
        int k = 5;
        System.out.println("k= :" + k);
        k++; // k = k + 1
        System.out.println("k++ :" + k);
        k--; // k = k - 1
        System.out.println("k-- :" + k);

    }
}
