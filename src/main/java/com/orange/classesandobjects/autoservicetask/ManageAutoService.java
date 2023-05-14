package com.orange.classesandobjects.autoservicetask;

import java.sql.SQLOutput;

public class ManageAutoService {
    public static void main(String[] args) {
        Car myCar = new Car("red", "automatic", "petrol", 110000, 2010, 6000);
        System.out.println();
        System.out.println("I have a " + myCar.colour + " car, with the related below details:"+"\n"+
               "Gear type - " +myCar.gearType+";"+"\n"+"Fuel type - "+myCar.fuelType + ";" +"\n"+"KMs on board - "+ myCar.kmPassed + "km;"
                +"\n"+"Year - "+ myCar.productionYear + ";"+"\n"+"Price - "+myCar.carPrice + "EUR.");

        Car myCarRegisterData = new Car("Honda", "Jazz", "CRD/2567");
        System.out.println("The car registration data as brand, model, plate number required at the Registration Office are: "
                + myCarRegisterData.brand + "_" +
                myCarRegisterData.model + " _" + myCarRegisterData.plateNumber + ".");

        System.out.println();
        Garage autoHonda = new Garage();
        autoHonda.scheduler = "Mon/Fri,9AM-6PM";
        System.out.println("Working scheduler: "+autoHonda.scheduler+".");
        Garage autoHondaInfo = new Garage("ABC001", true, 4);
        System.out.println("The Honda's Garage number ID is " + autoHondaInfo.numberID + " with " + autoHondaInfo.carCapacity +
                " workplaces and with computer diagnostics: " + autoHondaInfo.hasComputerDiagnostic + ".");

        System.out.println();
        Tool elevatorHonda = new Tool("2-post lift");
        System.out.println("The auto garage has the most popular car elevator called " + elevatorHonda.name + ".");
        Tool essentialMechanicTool = new Tool();
        elevatorHonda.uniqueCode = 555;
        elevatorHonda.needsElectricity = true;
        elevatorHonda.hasScissorLift = true;
        elevatorHonda.isUsed = false;
        System.out.println("The garage has a professional elevator with the following data:" + "\n" + "Name: " + elevatorHonda.name + ";"+
                "\n" + "Unique code: " + elevatorHonda.uniqueCode + "...;" + "\n" + "requires electricity? - " + elevatorHonda.needsElectricity + ";" +
                        "\n" + "scissor type elevator? - " + elevatorHonda.hasScissorLift + ";" + "\n" + "brand new elevator? - "
                        + elevatorHonda.isUsed + ".");

        System.out.println();
        Worker experiencedGeorge = new Worker();
        experiencedGeorge.age = 35;
        experiencedGeorge.isExperienced = true;
        experiencedGeorge.gender = "male";
        experiencedGeorge.name = "George";
        experiencedGeorge.specialization = "auto technician";
        System.out.println("The auto garage worker's profile has the following data:" + "\n" + "name - " + experiencedGeorge.name + "; " + "\n" +
                "gender - " + experiencedGeorge.gender + ";" + "\n" + "age - " + experiencedGeorge.age + "yrs;" + "\n" + "specialization - " + experiencedGeorge.specialization
                + ";" + "\n" + "has working experience? - " + experiencedGeorge.isExperienced + ".");

    }

}

