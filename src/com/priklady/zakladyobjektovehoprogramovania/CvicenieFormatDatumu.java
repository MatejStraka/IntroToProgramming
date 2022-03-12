package com.priklady.zakladyobjektovehoprogramovania;

/*
Napiste program, v ktorom vytvorite triedu Datum. Tato tried bude obsahovat 3 informacie:
 den (int)
 mesiac (int)
 rok (int)
 Trieda by mala mat konstruktor, ktory inicializuje instancne premenne - den, mesiac, rok. Budeme predpokladat ze uzivatelom zadane hodnoty su sprave.
 Vytvorte getter a setter metody pre kazdu instancnu premennu.
 Vytvorte metodu zobrazDatum, ktora vypise den, mesiac a rok oddeleny / (priklad: 12/3/2022)
 Napiste testovaciu triedu s metodou main, v ktorej pouzijete vytvorenu triedu Datum a ukazete ako funguje - od uzivatela si vypitate den, mesiac a rok a potom ho zobrazite vo formate s /
 Priklad programu:
 Zadaj den:
 12
 Zadaj mesiac:
 3
 Zadaj rok
 2022

 Uzivatel zadal:
 Den: 12
 Mesiac: 3
 Rok: 2022

 Datum v novom formate:
 12/3/2022
 */

import java.util.Scanner;

class Datum {
    private int den;
    private int mesiac;
    private int rok;
    public Datum(int zadanyDen,int zadanyMesiac, int zadanyRok) {
        den = zadanyDen;
        mesiac = zadanyMesiac;
        rok = zadanyRok;
    }

    public void setDen(int zadanyDen) {
        den = zadanyDen;
    }

    public int getDen() {
        return den;
    }

    public void setMesiac(int zadanyMesiac) {
        mesiac = zadanyMesiac;
    }

    public int getMesiac() {
        return mesiac;
    }

    public void setRok(int zadanyRok) {
        rok = zadanyRok;
    }

    public int getRok() {
        return rok;
    }

    public void zobrazDatum() {
        System.out.printf("%d/%d/%d", den,mesiac,rok);
    }
}

class TestDatumu {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Datum novyDatum;
        novyDatum = new Datum(12,3, 2022);

        System.out.println("Zadaj den:");
        int novyDen = userInput.nextInt();
        novyDatum.setDen(novyDen);

        System.out.println("Zadaj mesiac:");
        int novyMesiac = userInput.nextInt();
        novyDatum.setMesiac(novyMesiac);

        System.out.println("Zadaj rok:");
        int novyRok= userInput.nextInt();
        novyDatum.setRok(novyRok);

        System.out.println("Den: " + novyDatum.getDen());
        System.out.println("Mesiac: " + novyDatum.getMesiac());
        System.out.println("Rok: " + novyDatum.getRok());

        System.out.println("Datum v novom formate:");
        novyDatum.zobrazDatum();
    }
}
