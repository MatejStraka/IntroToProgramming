package com.examples.day2;

public class IfThenElse {

    public static void main(String[] args){
        int testScore = 76;
        char znamka;
        if(testScore>=90){
            znamka = '1';
        } else if(testScore>=80){
            znamka='2';
        } else if(testScore>=70){
            znamka='3';
        } else if(testScore>=60){
            znamka='4';
        } else {
            znamka='5';
        }
        System.out.println("Znamka = " + znamka);

    }
}
