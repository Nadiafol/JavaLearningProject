package com.orange.classesandobjects.autoservicetask;

public class Car {
    String plateNumber;
    String colour;
    String model;
    String brand;
    String gearType;
    String fuelType;
    int kmPassed;
    int productionYear;
    int carPrice;
  //* This constructor has 6 parameters: colour, gear type, fuel type, km, production year and price.
    public Car(String colour, String gearType, String fuelType, int kmPassed,int productionYear, int carPrice) {
        this.colour = colour;
        this.gearType = gearType;
        this.fuelType = fuelType;
        this.kmPassed = kmPassed;
        this.productionYear = productionYear;
        this.carPrice = carPrice;
    }
 //*This constructor has 3 parameters: brand, model and plate number
    public Car(String brand, String model, String plateNumber) {
        this.brand = brand;
        this.model = model;
        this.plateNumber = plateNumber;
    }

}
