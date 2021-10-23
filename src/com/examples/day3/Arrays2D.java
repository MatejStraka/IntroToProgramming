package com.examples.day3;

import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        String[][] jmena = {{"Mgr. ", "Ing. ", "Dr. "}, {"Novak", "Dvorak"}};
        System.out.println(jmena[0][0] + jmena[1][0]); //Mgr. Novak
        System.out.println(jmena[0][2] + jmena[1][1]); //Dr. Dvorak
    }
}
