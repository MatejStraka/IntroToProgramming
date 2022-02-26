package com.priklady.premenneatypy.premenneatypy;

public class PracaSCiselnymiTypmi {
    public static void main(String[] args) {

        int i1; //deklaracia premennej, obdobne aj pre ostatne zakladne typy ako byte, short, int, long, double, float, boolean, char
        //System.out.println(number); // IntelliJ vypise chybu pretoze premenna nie je inicializovana, program nepojde skompilovat
        i1 = 26; // inicializacia premennej v desiatkovej sustave
        System.out.println(i1);
        i1 = 032; //8-ickova sustava
        System.out.println(i1);
        i1 = 0x1a; //16-tkova sustava
        System.out.println(i1);

        //pretypovanie
        byte b1 = (byte) i1; // pretypovanie int na byte
        System.out.println(i1);
        byte b2 = 10; // deklaracia aj inicializacia v jednom
        i1 = b2; // pretypovat netreba lebo byte ma mensi rozsah ako int
        System.out.println(i1);

        //hodnota je stale ulozena ako int, pretoze Java pouziva primarne int pre cele cisla, ak chceme typ long tak to treba priamo zapisat pomocou l alebo L
        long pretecenie = Integer.MAX_VALUE+1; //pretecenie typu int, obsahuje najmensiu hodnotu typu integer, co je rovne Integer.MIN_VALUE
        System.out.println(Integer.MIN_VALUE);
        System.out.println(pretecenie);
        long l1 = Integer.MAX_VALUE+1L; // long ma vacsi rozsah ako int
        System.out.println(l1);

        i1 = (int) l1; // pretypovanie long na int
        System.out.println(i1); //pretecenie, i1 obsahuje najmensiu hodnotu typu integer, co je rovne Integer.MIN_VALUE
        System.out.println(Integer.MIN_VALUE);


        float f=123.4F; //float ma mensiu presnost ako double
        //ak do float dame 1.2 tak chyba pri kompilaci - float musi koncit f alebo F pretoze bez f(F) sa interpretuje ako double
        System.out.println(f);

        double d = 123.4;
        System.out.println(d);
        d =123.4e2; //double vo vedeckej notacii 1234*10na2=12340.0
        System.out.println(d);

        //pretypovanie
        f = (float) d; //pretypovanie double na float
        System.out.println(f);

    }
}
