package com.priklady.premenneatypy.premenneatypy;

public class Pretypovanie {
    public static void main(String[] args) {
        // Delenie dvoch cisel
        // delime dve cele cisla bez pouzitia pretypovania - vysledek je cele cislo
        System.out.println("Delenie dvoch celych cisel 10 / 3 = " + 10 / 3);
        // delime dve cele cisla s pouzitim pretypovania - vysledok je desatinne cislo
        System.out.println("Delenie dvoch celych cisel s pretypovanim 10 / 3 = " + ((double)10 / 3));
        // delime dve cele cisla s pouzitim pretypovania - vysledok je desetinne cislo
        System.out.println("Delenie dvoch realnych cisel 10.25 / 3.5 = " + 10.25/3.5);

        // Rozny zapis priradenia
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

    }
}
