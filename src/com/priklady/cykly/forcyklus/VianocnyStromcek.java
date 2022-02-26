package com.priklady.cykly.forcyklus;

// The following program should print the Christmas tree to the screen as follows
//          *
//         ***
//        *****
//       *******
//      *********
//     ***********
//    *************
//   ***************
//  *****************
// *******************
// The program does not work properly and prints the tree in reverse order, correct the errors so
// that the program works correctly.

/*public class VianocnyStromcek {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++)
                System.out.print("*");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print(" ");
            System.out.println();
        }
    }
}*/


//// Solution
public class VianocnyStromcek {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}