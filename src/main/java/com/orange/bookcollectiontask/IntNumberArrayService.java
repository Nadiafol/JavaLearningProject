package com.orange.bookcollectiontask;

public class IntNumberArrayService {
    public static int getTheMinValueOfTheArray(int[] intArray) {
        int minValue = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < minValue) {
                minValue = intArray[i];
            }
        }
        return minValue;
    }

    static int getTheMinValueIndexOfTheArray(int[] intArray) {
        int minValue = intArray[0];
        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < minValue) {
                minValue = intArray[i];
                index = i;
            }
        }
        return index;
    }
    static int getElementsAverage(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
        }
        return sum/intArray.length;
    }
}

