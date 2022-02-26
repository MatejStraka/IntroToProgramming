package com.priklady.premenneatypy.operatory;

/*
operator instanceof porovnava typ objektu, da sa pomocou neho zistit ci je pobjekt instanciou danej triedy/podtried alebo implementuje rozhranie
 */
public class OperatorInstanceOf {

    public static void main(String[] args){
        Rodic obj1 = new Rodic();
        Rodic obj2 = new Potomok();

        System.out.println("obj1 instance of Rodic: " + (obj1 instanceof Rodic));
        System.out.println("obj1 instance of Potomok: " + (obj1 instanceof Potomok));
        System.out.println("obj1 instance of Rozhranie: " + (obj1 instanceof Rozhranie));
        System.out.println("obj2 instance of Rodic: " + (obj2 instanceof Rodic));
        System.out.println("obj2 instance of Potomok: " + (obj2 instanceof Potomok));
        System.out.println("obj2 instance of Rozhranie: " + (obj2 instanceof Rozhranie));

    }
}

class Rodic{}
class Potomok extends Rodic implements Rozhranie {}
interface Rozhranie{}