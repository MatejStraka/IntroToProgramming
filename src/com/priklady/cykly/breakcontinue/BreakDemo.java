package com.priklady.cykly.breakcontinue;

/*
Napiste program ktory najde zadane cislo v poli a vypise hladane cislo spolu s indexom najdeneho prvku v poli
 */
public class BreakDemo {

    public static void main(String[] args){
        int[] poleIntu={32, 87, 3, 589, 12, 1076, 200, 8, 622, 127};
        int hledaSe = 12;
        int i;
        boolean nalezeno=false;

        for (i=0; i<poleIntu.length; i++) {
            if (poleIntu[i] == hledaSe) {
                nalezeno = true;
                break;
            }
        }

        if(nalezeno) {
            System.out.println("Nalezeno " + hledaSe + " s indexem " + i);
        } else {
            System.out.println(hledaSe + " neni v poli");
        }
    }
}
