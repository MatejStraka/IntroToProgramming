package com.priklady.zakladyobjektovehoprogramovania.dedicnost;

public class HorskeKolo extends Bicykel {
    public int vyskaSedla;

    public HorskeKolo(int pocatecniVyska) {
        //super(pocatecniFrekvence, pocatecniRychlost, pocatecniPrevod);
        vyskaSedla=pocatecniVyska;
    }
    public void setVyska(int novaVyska){
        vyskaSedla = novaVyska;
    }
}
