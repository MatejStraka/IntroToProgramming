package com.priklady.premenneatypy;

/*
Napiste program ktory vypocita vypocita sin() uhlu 30 stupnov
 */

public class VypocetSinus30Stupnov {

    public static void main(String[] args) {
        // Zadání vstupních hodnot.
        double uhel = 30; // úhel ve stupních

        // Výpočet Sin.
        // metoda Math.sin vyžaduje jako vstup úhel
        double v1 = Math.sin(Math.toRadians(uhel)) ;
        float v11 = (float) Math.sin(Math.toRadians(uhel)) ;
        double v111 = (float) Math.sin(Math.toRadians(uhel)) ;
        /* Výpočet úhlů dává odchylku při ukládání vypočtené
           hodnoty jako typ double. Řešení je přetypování
           vypočtené hodnoty na typ float. */

        // zobrazení výsledků sin
        System.out.println("Double : Sin("+uhel+")=" + v1);
        System.out.println("Float : Sin("+uhel+")=" + v11);
        System.out.println("Double(Float) : Sin("+uhel+")=" + v111);
    }

}
