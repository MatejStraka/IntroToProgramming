package com.examples;

public class WrapperClasses {
    public static void main(String[] args) {
        byte b = 68;
        short s = 10000;
        int i = 2147483647;
        long l = 822337203;
        float f = 234.5f;
        double d = 123.4;
        boolean bo = true;
        char c='A';

        Byte bb = 68;
        Short ss = 10000;
        Integer ii = 2147483647;
        Long ll = 822337203L;
        Float ff = 234.5f;
        Double dd = 123.4;
        Boolean boo = true;
        Character chr='A';

        System.out.println(b);
        System.out.println(bb);
        System.out.println(bb.toString());
        float bbf=bb.floatValue();
        System.out.println(bbf);
        Integer compare=bb.compareTo(b);
        System.out.println(compare);
        System.out.println(chr);


    }

}
