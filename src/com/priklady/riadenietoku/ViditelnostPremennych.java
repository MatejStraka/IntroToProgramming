package com.priklady.riadenietoku;

public class ViditelnostPremennych {

    public static void main(String[] args) {
        // block1
        int a = 1;
        {
            // block2
            a = 10; // we can use a variable from an external block
            int b = 20; // we can use the variable from the current block
            if (a == 10) {
                // block3
                a = 100;
                b = 200;
                int c = 300;
            }
            // again blok2
            System.out.println(a); // will print 100
            System.out.println(b); // will print 200
            //System.out.println(c); // compilation error; you cannot use a variable from an internal block
        }
        // again block1
    }
}
