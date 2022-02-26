package com.priklady.premenneatypy.operatory;

/*
&& podmienkova operacia AND
|| podmienkova operacia OR

 */
public class PodmienkoveOperatory {

    public static void main(String[] args) {
        int hodnota1 = 1;
        int hodnota2 = 2;
        if((hodnota1 == 1) && (hodnota2 == 2))
            System.out.println("hodnota1 je 1 A hodnota2 je 2");
        if((hodnota1 == 1) || (hodnota2 == 1))
            System.out.println("hodnota1 je 1 ALEBO hodnota2 je 1");
    }
}
