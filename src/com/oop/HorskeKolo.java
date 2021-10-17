package com.oop;

public class HorskeKolo extends Bicykel{
    public int vyskaSedla;

    public HorskeKolo(int pocatecniFrekvence, int pocatecniRychlost, int pocatecniPrevod, int pocatecniVyska) {
        //super(pocatecniFrekvence, pocatecniRychlost, pocatecniPrevod);
        vyskaSedla=pocatecniVyska;
    }
    public void setVyska(int novaVyska){
        vyskaSedla = novaVyska;
    }
}
