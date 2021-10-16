package com.examples;

public class Variables {
    public static void main(String[] args) {
        int number; //byte, short int, long
        //System.out.println(number);
        number=26;
        //osmickova number=032;
        //16tkova sustava number=0x1a;
        System.out.println(number);

        float f=123.4f; //float ma mensiu presnost ako double
        //ak do float dame 1.2 tak chyba pri kompilaci - float musi koncit f lebo bez f sa interpretuje ako double
        //f=1.2;
        System.out.println(f);

        double d=123.4;
        System.out.println(d);
        d=123.4e2; //double ve vedecke notaci 1234*10na2=12340.0
        System.out.println(d);


        char ch='A';
        System.out.println(ch);
        ch='Č';
        System.out.println(ch);
        ch='\u0108';
        System.out.println(ch);

        boolean b=true;
        System.out.println(b);
        b=false;
        System.out.println(b);
    }
}
