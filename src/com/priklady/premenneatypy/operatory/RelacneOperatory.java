package com.priklady.premenneatypy.operatory;

/*
== rovna sa
!= nerovna sa
> vacsi ako
< mensi ako
>= vacsi alebo rovny ako
<= mensi alebo rovny ako
 */
public class RelacneOperatory {

    public static void main(String[] args){
        int hodnota1 = 1;
        int hodnota2 = 2;
        if(hodnota1 == hodnota2) // false
            System.out.println("hodnota1 == hodnota2");
        if(hodnota1 != hodnota2) //true
            System.out.println("hodnota1 != hodnota2");
        if(hodnota1 > hodnota2) //false
            System.out.println("hodnota1 > hodnota2");
        if(hodnota1 < hodnota2) //true
            System.out.println("hodnota1 < hodnota2");
        if(hodnota1 >= hodnota2) //false
            System.out.println("hodnota1 >= hodnota2");
        if(hodnota1 <= hodnota2) //true
            System.out.println("hodnota1 <= hodnota2");

    }
}
