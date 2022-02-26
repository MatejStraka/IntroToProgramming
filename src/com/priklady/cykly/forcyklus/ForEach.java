package com.priklady.cykly.forcyklus;

// Napiste program ktory vypise vsetky prvky pola.

public class ForEach {

    public static void main(String[] args){
        int[] cisla={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int cislo : cisla){
            System.out.println("Pocet je: " + cislo);
        }
    }
}
