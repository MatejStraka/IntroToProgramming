package com.priklady.zakladyobjektovehoprogramovania;

/*
 Vytvorte triedu Sporenie. Pouzite staticku premennu nazvanu rocnyUrok, do ktorej ulozite vysku uroku. Vyska uroku je rovnaka pre vsetkych sporitelov.
 Kazda instancia triedy sporenie bude obsahovat instancnu premennu nasporenaSuma, ktora bude mat hodnotu nasporenej sumy daneho sporitela.
 Vytvorte metodu spocitajMesacnyUrok, ktora bude spocita mesacny urok na zaklade nasporenej sumy a rocneho uroku  (nasporenaSuma * urok/12, mesacny urok bude pripocitany do nasporenej sumy v ramci tejto metody.
 Vytvorte staticku metodu, pomocou ktorej budete moct zmenit hodnotu rocneho uroku.
 Napiste testovaciu triedu s main metodou v ktorej ukazete ako trieda Sporenie funguje:
 Vytvorte 2 sporiace ucty. Na jeden pridajte 1000Kc a na druhy 2000Kc.
 Nastavte rocny urok na 4%.
 Spocitajte mesacny urok a vyppiste nasporenu sumu aj s urokom pre oba sporiace ucty.
 Zmente rocny urok na 5% a vypocitejte novy mesacny urok a znova vypiste nsaporene sumy na oboch sporiacich uctoch.
 */

class Sporenie {
    public static double rocnyUrok;
    private double nasporenaSuma;

    public Sporenie() {
        rocnyUrok = 0.0;
        nasporenaSuma = 0.0;
    }

    public Sporenie(double urok, double suma) {
        rocnyUrok = urok;
        nasporenaSuma = suma;
    }

    public double spocitajMesacnyUrok() {
        double zisk = (nasporenaSuma * rocnyUrok/12);
        nasporenaSuma = nasporenaSuma + zisk;
        return zisk;
    }

    public static void setRocnyUrok(double novyUrok) {
        rocnyUrok = novyUrok;
    }

    public void setNasporenaSuma(double novaSuma) {
        nasporenaSuma = novaSuma;
    }
    public double getNasporenaSuma() {
        return nasporenaSuma;
    }
    public double getRocnyUrok() {
        return rocnyUrok;
    }
}

class TestSporiacehoUctu {
    public static void main(String[] args) {
        Sporenie sporiaciUcet1 = new Sporenie();
        Sporenie sporiaciUcet2 = new Sporenie();
        sporiaciUcet1.setNasporenaSuma(1000.00);
        sporiaciUcet2.setNasporenaSuma(2000.00);
        Sporenie.setRocnyUrok(0.04);
        sporiaciUcet1.spocitajMesacnyUrok();
        sporiaciUcet2.spocitajMesacnyUrok();
        System.out.println("Novy zostatok na sporiacom ucte je = " + sporiaciUcet1.getNasporenaSuma());
        System.out.println("Novy zostatok na sporiacom ucte je = " + sporiaciUcet2.getNasporenaSuma());
        Sporenie.setRocnyUrok(0.05);
        sporiaciUcet1.spocitajMesacnyUrok();
        sporiaciUcet2.spocitajMesacnyUrok();
        System.out.println("Novy zostatok na sporiacom ucte je = " + sporiaciUcet1.getNasporenaSuma());
        System.out.println("Novy zostatok na sporiacom ucte je = " + sporiaciUcet2.getNasporenaSuma());

    }
}
