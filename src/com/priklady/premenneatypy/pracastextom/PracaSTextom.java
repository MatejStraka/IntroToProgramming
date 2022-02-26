package com.priklady.premenneatypy.pracastextom;

import java.util.Locale;

public class PracaSTextom {

    public static void main(String[] args) {

        String st = "Software Development Academy";
        System.out.println(st.length());
        System.out.println(st.toUpperCase(Locale.ROOT));
        System.out.println(st.indexOf("Software"));
        System.out.println(st.contains("Software"));
        System.out.println(st.substring(9));
        System.out.println(st.replace(' ', '.'));
        String newString = st.concat(" Novy Text");
        System.out.println(newString);
        System.out.println(String.join("-",st, "Text", "123"));
        System.out.println(st);
        System.out.print(st);
        System.out.println(st);
        System.out.printf("My cat, %s, is %d years old.%n", "Fluffy", 8);

        String myVar = new String("This String is String!");
        String [] textovePole = myVar.split(" "); // ["This", "String", "is", "String!"]
        for (String text : textovePole) {
            System.out.println(text);
        }
        myVar.replace("!", "."); // This String is String.
        System.out.println(myVar);

        String prazdnyText = ""; // premenna je inicializovana, ma prazdnu hodnotu
        System.out.println(prazdnyText.length()); // pre prazdny String je mozne volat metody
        String nemaHodnotu = null; // literal null znamena ze premenna nema priradenu ziadnu hodnotu cize nie je inicializovana
        //System.out.println(nemaHodnotu.length()); // nemozu sa volat metody chyba pri behu programu

    }
}