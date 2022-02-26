package com.priklady.riadenietoku.prikazIf;

/*
Napiste program ktory varuje vodica automobilu ak ide prilis rychlo
Maximalna povolena rychlost je 130 km/h
 */
public class IfElse {

    public static void main(String[] args) {
        int rychlostAuta = 150;

        if (rychlostAuta <= 130) {
            System.out.println("Ides povolenou rychlostou");
        } else{
            System.out.println("Spomal, prekrocil si povolenu rychlost");
        }
    }
}
