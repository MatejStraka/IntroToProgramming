package com.priklady.argumentyprikazovehoriadku;

/*
Napiste program ktory pracuje s argumentami prikazoveho riadku
Program vypise vsetky argumenty pomocou metody println
Pridanie argumentov cez menu: Run->Edit Configuration... kde vyplnime pole Program arguments
 */
public class Echo {
    public static void main(String[] args) {
        for (String s: args) {
            System.out.println(s);
        }
    }
}
