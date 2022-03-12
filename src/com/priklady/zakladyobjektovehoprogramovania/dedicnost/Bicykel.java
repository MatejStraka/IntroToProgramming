package com.priklady.zakladyobjektovehoprogramovania.dedicnost;

public class Bicykel {
    public int frekvence;
    public int prevod;
    public int rychlost;
    public int id;
    public static int pocetBicyklov = 0;

    public Bicykel(){
        prevod = 0;
        frekvence = 0;
        rychlost = 0;
        id = ++pocetBicyklov;
    }

    public Bicykel(int pocatecniFrekvence, int pocatecniRychlost, int pocatecniPrevod){
        prevod = pocatecniPrevod;
        frekvence = pocatecniFrekvence;
        rychlost = pocatecniRychlost;
        id = ++pocetBicyklov;
    }

    public int getID(){
        return id;
    }

    public static int getPocetBicyklov(){
        return pocetBicyklov;
    }
    public void setFrekvence( int novaFrekvence){
        frekvence = novaFrekvence;
    }

    public void setPrevod( int novyPrevod){
        prevod = novyPrevod;
    }

    public void brzdit(int ubytek){
        rychlost -=ubytek;
    }

    public void zrychlit(int narust){
        rychlost +=narust;
    }

    public void vypsatStav(){
        System.out.println("Frekvence slapani: " + frekvence
                +" rychlost: " + rychlost
                +" prevod: " + prevod);
    }
}