package com.priklady.cykly.polia;

// Write a program which creates the array for 10 values, integer type.
// Program should populate values in array with a random numbers from [0..10]
// Then
// - print array and it's values
// - print minimum value from array
// - print maximum value from array

public class Exercise13 {
    public static void main(String[] args) {

        // Initialize variables
        int[] myIntArray = new int[10];

        // Populate array with values
        for (int i = 0; myIntArray.length > i; i++ ) {
            myIntArray[i] = (int) (Math.random() * 10);
        }

        // Print array values
        for (int i = 0; i < myIntArray.length; i++ ) {
            System.out.println("Value from array: " + myIntArray[i]);
        }

        // Execute method getMax(), to print maximum value
        int max = getMax(myIntArray);
        System.out.println("Max is: " + max);

        // Execute method getMin(), to print min value
        int min = getMin(myIntArray);
        System.out.println("Min is: " + min);
    }

    // Method which returns max value
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    // Method which returns min value
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}