package com.examples.day3;

import java.util.Arrays;
import java.util.Scanner;

public class PraceSPolem {

    public static void main(String[] args) {
         // Deklarace číselného pole a výpis prázdného pole na obrazovku
         int pole1[] = new int[20];
         System.out.println("Výpis pole po deklaraci:");
         for (int i = 0; i < pole1.length; i++) {
             System.out.print(pole1[i]+" ");
             }
         // Naplnění každého prvku pole inicializační hodnotu = 5
         Arrays.fill(pole1, 5);
         System.out.println();
         System.out.println("Výpis pole po naplnění:");
         for (int i = 0; i < pole1.length; i++) {
             System.out.print(pole1[i]+" ");
             }

         // Setřídění číselného pole
         int vek[] = new int[10]; // pole bude mít deset prvků
         // Naplnění pole pomoci cyklu For
         Scanner sc = new Scanner(System.in);
         System.out.println();
         for (int i = 0; i < 10; i++) {
             System.out.print((i+1)+". Zadej věk: ");
             vek[i] = sc.nextInt();
             }
         // Setřídění číselného pole pomoci metody Arrays.sort()
         Arrays.sort(vek);
         // Výpis obsahu pole pomoci cyklu For
         for (int i = 0; i < 10; i++) {
             System.out.println((i+1)+". Věk: "+vek[i]);
             }

         // Setřídění textového pole
         /* Jestliže třídíme textové pole s diakritikou, tak znaky s diakritikou
             se setřídí až na konec. Metoda Arrays.sort() netřídí správně češtinu.*/
         String jmena[] ={"Karel","Aleš","Přemek","Štěpán","Zuzana","Jana", "Alice","Čeněk"};

         Arrays.sort(jmena);
         System.out.println();
         // Jiný způsob použití pole a cyklu For bez indexu i (for-each)
         for (String jmena1 : jmena) {
             System.out.print(jmena1+" ");
             }

         // Kopie části pole.
         /* Kopírují se prvky z pole jmena od pozice 3(včetně) do pozice 6(bez).
             Výsledek kopírování se uloží do pole nove_pole. */
         String nove_pole[] = Arrays.copyOfRange(jmena, 3, 6);
        System.out.println();
        for (String jmena1 : nove_pole) {
             System.out.print(jmena1+" ");
             }

        // Hledání v poli.
        Scanner scc = new Scanner(System.in, "Windows-1250"); // pro řetězce
        System.out.println();
        System.out.print("Zadej hledané jméno: ");
        String jmeno = scc.nextLine();
        // Hledáme v poli jmena.
        Arrays.sort(jmena); // před hledáním je nutno pole setřídit
        /* Metoda Arrays.binarySearch() vyhledá text v poli a vrátí pořadový index
         nalezeného prvku pole. Při neúspěšném hledání vrátí index číslo <0
        Při hledání je nutno dodržovat velká a malá písmena.*/
        int index = Arrays.binarySearch(jmena, jmeno); // hledání v poli
        System.out.println();
        for (String jmena1 : jmena) { // výpis setříděného pole ve kterém hledáme
            System.out.print(jmena1+" ");
        }
        // Zobrazení výsledku hledání.
        System.out.println();
        if (index>=0) {
            System.out.println("Hledané jméno '"+jmeno+"' má index v poli:" + index);
        } else {
            System.out.println("Zadané jméno '"+jmeno+"' v poli neexistuje.");
        }

    }

}
