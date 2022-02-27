package com.priklady.cykly.polia;

public class TrojrozmernePole {

    public static void main(String[] args) {

        int[][][] yetAnotherArray = new int[][][]{ { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12} }, { {13, 14, 15, 16}, {17, 18, 19, 20}, {21, 22, 23, 24} } };

        for (int ind1 = 0; ind1 < yetAnotherArray.length; ++ind1){
            for (int ind2 = 0; ind2 < yetAnotherArray[0].length; ++ind2){
                for (int ind3 = 0; ind3 < yetAnotherArray[0][0].length; ++ind3){
                    System.out.print(yetAnotherArray[ind1][ind2][ind3] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
