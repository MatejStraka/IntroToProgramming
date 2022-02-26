package com.priklady.cykly.polia;

import java.util.Scanner;

public class NacitaniePolaZoVstupu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pocet prvkov pola: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Vloz hodnotu cislo " + i + ": ");
            arr[i] = in.nextInt();
        }

        in.close();

        System.out.println("Vlozene hodnoty su: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
