package com.orange.operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int a= 15;
        int b= 10;
        System.out.println();
        System.out.println("For the variables a = "+a + " and b = "+b +" we have displayed the below assignment operations results:");
        int result=a;
        System.out.println("Simple assignment oeration:"+result);
        result +=b;
        System.out.println("Assignment operation with sum:"+result);
        result -=b;
        System.out.println("Assignment operation with substraction:"+result);
        result *=b;
        System.out.println("Multiplication assignment operation:"+result);
        result /=b;
        System.out.println("Division assignment operation:"+result);
        result %=b;
        System.out.println("Devision with remainder assignment operation:"+result);
    }
}
