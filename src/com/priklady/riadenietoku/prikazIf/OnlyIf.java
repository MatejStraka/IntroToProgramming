package com.priklady.riadenietoku.prikazIf;

/*
Napste program ktory vodica automobilu varuje ak ide prilis rychlo alebo prilis pomaly
Maximalna povolena rychlost je 130km/h a minimalna rychlost 50km/h
 */
public class OnlyIf {

    public static void main(String[] args){
        int rychlostAuta = 150;
        if(rychlostAuta>130)
            System.out.println("Spomal, prekrocil si povolenu rychlost");

        if(rychlostAuta<50){
            System.out.println("Pridaj, ides prilis pomalu");
        }
    }
}
