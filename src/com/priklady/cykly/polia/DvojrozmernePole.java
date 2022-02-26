package com.priklady.cykly.polia;

public class DvojrozmernePole {

    public static void main(String[] args) {

        String[][] mena = {{"Mgr. ", "Ing. ", "Dr. "}, {"Novak", "Dvorak"}};
        System.out.println(mena[0][0] + mena[1][0]); //Mgr. Novak
        System.out.println(mena[0][2] + mena[1][1]); //Dr. Dvorak

    }
}
