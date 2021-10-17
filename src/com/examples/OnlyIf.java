package com.examples;

public class OnlyIf {

    public static void main(String[] args){
        int rychlostAuta = 150;
        if(rychlostAuta>=130)  System.out.println("Spomal, prekrocil si povolenu rychlost");

        if(rychlostAuta<50){
            System.out.println("Pridaj, ides prilis pomalu");
        }
    }
}
