package com.examples;

public class ForArrayLoop {

    public static void main(String[] args){
        int[] cisla={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int cislo : cisla){
            System.out.println("Pocet je: " + cislo);
        }
    }
}
