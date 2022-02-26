package com.priklady.premenneatypy.operatory;

// ++ operator inkrementace, zvysuje hodnotu o 1 - moze byt prefixovy alebo postfixovy
public class PrefixPostfixInkrementace {
    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i); // 4
        ++i;
        System.out.println(i); // 5
        System.out.println(++i); // 6   - vysledok vyhodnotenia prefixovej verzie je inkrementovana hodnota cize 6
        System.out.println(i++); // 6   - vysledok vyhodnotenia ppostfixovej verzie je povodna hodnota cize 6
        System.out.println(i); // 7

    }
}

