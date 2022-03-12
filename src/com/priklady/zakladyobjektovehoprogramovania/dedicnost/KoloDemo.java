package com.priklady.zakladyobjektovehoprogramovania.dedicnost;

public class KoloDemo {

    public static void main(String[] args){

        Bicykel kolo1=new Bicykel();
        Bicykel kolo2=new HorskeKolo(2);

        //vyvola metody techto objektov
        kolo1.setFrekvence(50);
        kolo1.zrychlit(10);
        kolo1.setPrevod(2);
        kolo1.vypsatStav();

        kolo2.setFrekvence(50);
        kolo2.zrychlit(10);
        kolo2.setPrevod(2);
        kolo2.setFrekvence(40);
        kolo2.zrychlit(10);
        kolo2.setPrevod(3);
        kolo2.vypsatStav();

    }
}
