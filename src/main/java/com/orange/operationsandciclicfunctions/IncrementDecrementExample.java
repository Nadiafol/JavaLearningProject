package com.orange.operationsandciclicfunctions;

import java.sql.SQLOutput;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a=9;
        System.out.println();
        System.out.println("For the variable a = "+a + " we have displayed the below increment/decrement operation results:");
        a++;
        System.out.println("Value after increment:"+a);
        ++a;
        System.out.println("Pre-fixed value increment:"+a);
        int b=++a;
        int a1=a;
        int c= a++;
        System.out.println("The value of the below variables are:"+"\n"+ "b="+b+";"+"\n"+"c="+c+";"+"\n"+"a1="+a1+";");
        System.out.println();
        a--;
        System.out.println("Value after decrement:"+a);
        --a;
        System.out.println("Value after pre-fixed decrement:"+a);
     }
}

