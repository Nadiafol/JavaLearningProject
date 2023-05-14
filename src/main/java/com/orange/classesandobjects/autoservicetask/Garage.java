package com.orange.classesandobjects.autoservicetask;

public class Garage {
    String address = "Sos.Balcani, Chisinau, Moldova.";
    String numberID;
    String scheduler;
    int carCapacity;
    boolean hasComputerDiagnostic;
    public Garage (){
        System.out.println("The garage's address is " + this.address);
    }
    public Garage (String numberID, boolean hasComputerDiagnostic, int carCapacity){
        this.numberID = numberID;
        this.hasComputerDiagnostic = hasComputerDiagnostic;
        this.carCapacity = carCapacity;
    }
}
