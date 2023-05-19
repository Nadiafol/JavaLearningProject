package com.orange.operationsandciclicfunctions;

public class AritmeticOperationExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println();
        System.out.println("For the variables a = "+a + " and b = "+b +" we have displayed the below arithmetic operations results:");
        int sum = a+b;
        System.out.println("Sum:"+sum);
        System.out.println("Sum:"+ (a+b));
        int sub = a-b;
        System.out.println("Substraction:" +sub);
        System.out.println("Substraction:"+(a-b));
        int result= a*b;
        System.out.println("The multiplication:" +result);
        result=a/b;
        System.out.println("The division:"+result);
        result=a%b;
        System.out.println("Division with remainder:"+result);

    }
}
