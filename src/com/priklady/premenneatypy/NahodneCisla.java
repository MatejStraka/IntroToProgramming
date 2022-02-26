package com.priklady.premenneatypy;

public class NahodneCisla {
    public static void main(String[] args) {
        // zobrazení náhodného čísal v rozmezí od 0 do 1
        System.out.println("Náhodné číslo: " + Math.random());
        // zobrazení celého náhodného čísala v rozmezí od 1 do 10
        /* Vygenerované náhodné číslo vynásobíme číslem 10 a připočteme k němu
         číslo 1, aby výsledek byl od 1 ne od 0. Aby vzniklo celé číslo,
         musíme provést přetypování na integer. */
        System.out.println("Náhodné číslo: "+((int)(Math.random()*10)+1) );

        // zaokrouhlení na celá čísla
        double cislo = 25.1796543;
        System.out.println("Zadané číslo: "+cislo);
        // parametr je desetinné číslo, zaokrouhluje se na celé číslo
        // (od 0.5 nahoru, jinak dolů)
        System.out.println("Zaokrouhleno round : "+Math.round(cislo));
        // číslo je vždy zaokrouhleno nahoru
        System.out.println("Zaokrouhleno ceil : "+Math.ceil(cislo));
        // číslo je vždy zaokrouhleno dolu
        System.out.println("Zaokrouhleno floor : "+Math.floor(cislo));
    }

}
