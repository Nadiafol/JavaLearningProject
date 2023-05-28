package com.orange.operationsandciclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int testResult = 58;
        if (testResult >= 90) {
            System.out.println("Grade A");
        } else if (testResult >= 80) {
            System.out.println("Grade B");
        } else if (testResult >= 70) {
            System.out.println("Grade C");
        } else if (testResult >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Such grade not defined.");
        }
    }
}