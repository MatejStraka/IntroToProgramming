package com.priklady.riadenietoku.prikazIf;

/*
Napiste program ktory, oznamkuje test na zaklade dosiahnutych percentualnych vysledkov:
znamka 1 ak je uspesnost testu aspon 90%
znamka 2 ak je uspesnost testu aspon 80%
znamka 3 ak je uspesnost testu aspon 70%
znamka 4 ak je uspesnost testu aspon 60%
znamka 5 ak je uspesnost pod 60%
 */
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
