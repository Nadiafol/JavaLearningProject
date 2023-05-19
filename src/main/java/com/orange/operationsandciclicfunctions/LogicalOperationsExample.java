package com.orange.operationsandciclicfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        boolean a=true;
        boolean b= false;
        System.out.println();
        System.out.println("For the variable a= "+a + " and b= "+b+ " we have displayed the below logic operations results:");
        boolean result= a&&b;
        System.out.println("logic AND:"+ result);
        a=result&&b;
        System.out.println("logic AND:"+a);
        result = a || b;
        System.out.println("logic OR: "+ result);
        System.out.println("Negation:"+ !!!result);


    }
}
