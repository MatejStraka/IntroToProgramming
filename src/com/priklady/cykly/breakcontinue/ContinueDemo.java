package com.priklady.cykly.breakcontinue;

/*
Napiste program ktory spocita vyskyt pismena s v retazci
 */
public class ContinueDemo {

    public static void main(String[] args){
        String prohledat = "Nesnese se" + " se sestrou";
        int max =prohledat.length();
        int pocetS = 0;

        for(int i=0; i< max; i++) {
            //sleduje pouze pismena s
            if (prohledat.charAt(i) != 's')
                continue;

            //zpracuje pismena s
            pocetS++;
        }
        System.out.println("Retezec obsahuje " + pocetS + " pismen 's'.");
    }
}
