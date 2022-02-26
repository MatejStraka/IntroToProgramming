package com.priklady.premenneatypy.premenneatypy;


//Napiste program ktory deklaruje a inicializuje primitivne datove typy na hodnoty
// - byte -> b = 68
// - short -> s = 10000
// - int -> i = 2147483647
// - long -> l = 822337203
// - float -> f = 234.5f
// - double -> d = 123.4
// - boolean -> bool = true
// Premenne vyppiste na standardny vystup
// Predchadzajuce zadanie zapiste pomocou wrapper tried


public class DeklaraciaAInicializacia {
    public static void main(String[] args) {

        // zakladne typy
        byte b1 = 68;
        short s1 = 10000;
        int i1 = 2147483647;
        long l1 = 822337203L;
        float f1 = 234.5f;
        double d1 = 123.4;
        boolean bool1 = true;
        char c1 ='A';

        //vypis hodnot
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(bool1);
        System.out.println(c1);

        // "wrapper class" - zapuzdruje zakladne typy do objektov
        Byte b2 = 68;
        Short s2 = 10000;
        Integer i2 = 2147483647;
        Long l2 = 822337203L;
        Float f2 = 234.5f;
        Double d2 = 123.4;
        Boolean bool2 = true;
        Character c2 ='A';

        //vypis hodnot
        System.out.println(b2);
        System.out.println(s2);
        System.out.println(i2);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d2);
        System.out.println(bool2);
        System.out.println(c2);

        // zakladne typy nemaju metody, ale wrapper triedy metody maju
        System.out.println(b2.toString());

        Integer compare=b2.compareTo(b1);
        System.out.println(compare);

        float floatHodnota = b2.floatValue();
        System.out.println(floatHodnota);

    }

}
