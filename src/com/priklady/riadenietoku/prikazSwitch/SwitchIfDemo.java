package com.priklady.riadenietoku.prikazSwitch;

import java.util.Scanner;

public class SwitchIfDemo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Zadaj poradove cislo mesiaca: ");
        int mesic = userInput.nextInt();

        if (mesic == 1) {
            System.out.println("Leden");
        } else if (mesic == 2) {
            System.out.println("Unor");
        } else if (mesic == 3) {
            System.out.println("Brezen");
        } else if (mesic == 4) {
            System.out.println("Duben");
        } else if (mesic == 5) {
            System.out.println("Kveten");
        } else if (mesic == 6) {
            System.out.println("Cerven");
        } else if (mesic == 7) {
            System.out.println("Cervence");
        } else if (mesic == 8) {
            System.out.println("Srpen");
        } else if (mesic == 9) {
            System.out.println("Zari");
        } else if (mesic == 10) {
            System.out.println("Rijen");
        } else if (mesic == 11) {
            System.out.println("Listopad");
        } else if (mesic == 12) {
            System.out.println("Prosinec");
        } else {
            System.out.println("Neplatny mesic");
        }
    }
}
