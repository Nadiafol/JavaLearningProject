package com.orange.classesandobjects.autoservicetask;

public class Tool {
    String name;
    boolean needsElectricity;
    boolean hasScissorLift;
    boolean isUsed;
    int uniqueCode = 555;
 //*"A new tool object has been created with name" + this.name
    public Tool(String name) {
        this.name = name;
          }

    public Tool() {
        System.out.println("Each tool has its unique code length of 10 digits that starts with " + this.uniqueCode+ "...");
    }
}
