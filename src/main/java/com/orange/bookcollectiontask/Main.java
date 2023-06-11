package com.orange.bookcollectiontask;

public class Main {
    public static void main(String[] args) {
        int[] tablouDeDate = {1,2,3,4,5,6,7,8,9,5,7,3,7,6};

        System.out.println(IntNumberArrayService.getTheMinValueOfTheArray(tablouDeDate));
        System.out.println(IntNumberArrayService.getTheMinValueIndexOfTheArray(tablouDeDate));
        System.out.println(IntNumberArrayService.getElementsAverage(tablouDeDate));
    }
}
