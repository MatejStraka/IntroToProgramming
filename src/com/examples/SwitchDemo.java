package com.examples;

public class SwitchDemo {
    public static void main(String[] args){
        int mesic = 10;
        switch(mesic){
            case 1:
                System.out.println("Leden"); break;
            case 2:
                System.out.println("Unor"); break;
            case 3:
                System.out.println("Brezen"); break;
            case 4:
                System.out.println("Duben"); break;
            case 5:
                System.out.println("Kveten"); break;
            case 6:
                System.out.println("Cerven"); break;
            case 7:
                System.out.println("Cervenec"); break;
            case 8:
                System.out.println("Srpen"); break;
            case 9:
                System.out.println("Zari"); break;
            case 10:
                System.out.println("Rijen"); break;
            case 11:
                System.out.println("Listopad"); break;
            case 12:
                System.out.println("Prosinec"); break;
            default:
                System.out.println("Neplatny mesic"); break;
        }
    }
}
