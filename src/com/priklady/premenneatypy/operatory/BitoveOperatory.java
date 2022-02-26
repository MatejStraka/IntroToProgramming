package com.priklady.premenneatypy.operatory;

public class BitoveOperatory {
    public static void main(String[] args)
    {
        // Initial values
        int a = 5; // 0101
        int b = 7; // 0111

        // bitovy AND
        // 0101 & 0111 = 0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitovy OR or
        // 0101 | 0111 = 0111 = 7
        System.out.println("a|b = " + (a | b));

        // bitovy XOR
        // 0101 ^ 0111 = 0010 = 2
        System.out.println("a^b = " + (a ^ b));

        // bitovy NOT
        // ~0101 = 1010
        // obrati 0 na 1 a 1 na 0.  1010 = -6
        System.out.println("~a = " + ~a);

        // bitovy posun vlavo
        // 0000 0101 << 2 = 0001 0100 (20)
        System.out.println("a<<2 = " + (a << 2));

        // bitovy posun vpravo
        // 0000 0101 >> 2 =0000 0001 (1)
        System.out.println("b>>2 = " + (b >> 2));

    }
}
