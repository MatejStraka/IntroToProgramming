package com.priklady.premenneatypy.operatory;

/*
+ unarny operator, oznacuje kladnu hodnotu
- unarny operator oznacuje zapornu hodnotu
++ operator inkrementace, zvysuje hodnotu o 1
--operator dekrementace znizuje hodnotu o 1
! operator logickeho doplnku, invertuje logicku hodnotu
 */
public class UnarneOperatory {

    public static void main(String[] args){

        int vysledok = +1; //vysledok je 1
        System.out.println(vysledok);
        vysledok--; //vysledok je 0
        System.out.println(vysledok);
        vysledok++; //vysledok je 1
        System.out.println(vysledok);
        vysledok = -vysledok; //vysledok je -1
        System.out.println(vysledok);
        boolean uspech = false;
        System.out.println(uspech);  //false
        System.out.println(!uspech); //true

    }
}

