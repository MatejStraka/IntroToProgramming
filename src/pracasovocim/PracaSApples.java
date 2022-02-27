package pracasovocim;


import com.priklady.zakladyobjektovehoprogramovania.ovocie.Apple;

public class PracaSApples {

    public static void main(String[] args) {
        // we create apples - Apple class objects
        Apple apple1 = new Apple();
        Apple apple2 = new Apple(8, "green");
        System.out.printf("1st apple's size is %d and colour is %s.%n", apple1.getSize(), apple1.getColour());
        System.out.printf("2nd apple's size is %d and colour is %s.%n%n", apple2.getSize(), apple2.getColour());

        // we set the fields of the first apple

        apple1.setSize(10);
        apple1.setColour("red");
        System.out.printf("Now 1st apple's size is %d and colour is %s.%n%n", apple1.getSize(), apple1.getColour());

        // we call the rot() method on the first apple
        System.out.print(apple1.rot(3, "brown"));
        System.out.printf(" And its colour is %s.%n", apple1.getColour());
    }
}
