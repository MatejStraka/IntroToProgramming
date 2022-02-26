package com.priklady.cykly.polia;

public class PracaSPolom {

    public static void main(String[] args) {
        int[] pole;
        pole = new int[10];  //prideli pamet pre 10 int-ov
        pole[3] = 345;
        System.out.println("Prvok na pozici 3 v poli: " +pole[3]);
        System.out.println(pole[0]);

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        // Outputs Volvo
        cars[0] = "Opel";
        System.out.println(cars[0]);
        // Vypise Opel namiesto Volvo
        System.out.println(cars.length);
        // Vypise vsetky auta v poli cars
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        // foreach - vypise vsekty prvky pola
        for (String car : cars) {
            System.out.println(car);
        }

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

        //vypise vsetky prvky
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

    }
}
