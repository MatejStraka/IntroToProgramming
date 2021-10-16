package com.examples;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] pole;
        pole = new int[10];  //prideli pamet pre 10 int-ov
        pole[3]=345;
        System.out.println("Prvek na pozici 3 v poli: " +pole[3]);
        System.out.println(pole[0]);
        for (int prvek : pole) {
            System.out.println(prvek);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        // Outputs Volvo
        cars[0] = "Opel";
        System.out.println(cars[0]);
        // Now outputs Opel instead of Volvo
        System.out.println(cars.length);
        // Outputs 4
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

    }
}
