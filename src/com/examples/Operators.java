package com.examples;

public class Operators {

    public static void main(String[] args) {
     int a,b;
     double result; //co sa stane ak result bude int?
     a=1;
     b=2;
     result = a+b;
     System.out.println(result);
     result = a-b;
     System.out.println(result);
     result = a*b;
     System.out.println(result);
     result = a/b;
     System.out.println(result);
     //result = a/0;
     System.out.println(result);
     result = a%b;
     System.out.println(result);
     System.out.println(a++);
     System.out.println(a);
     System.out.println(++b);

     String s1 = "HELLO";
     String s2 = "HELLO";
     String s3 =  new String("HELLO");
     System.out.println(s1 == s2); // true
     System.out.println(s1 == s3); // false
     System.out.println(s1.equals(s2)); // true
     System.out.println(s1.equals(s3)); // true

     System.out.println(s1 instanceof String);
    }
}
