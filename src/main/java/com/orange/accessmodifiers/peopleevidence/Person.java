package com.orange.accessmodifiers.peopleevidence;

import javax.swing.*;

public class Person {
    private static int noOfPersonObjects;
    public String name;
    public String surname;
    public String nationality;
    public String gender;
    String eyeColour;
    protected long phone;
    public String address;
    String occupation;
    String education;
    private final long CNP;
    private int age;
    boolean isMarried;

    public Person(long CNPObligatoriu) {
        CNP = CNPObligatoriu;
        noOfPersonObjects++;
    }

    public Person(long CNP, String name, boolean isMarried, int age, String eyeColour, String occupation, String education,long phone) {
        this.CNP = CNP;
        this.name = name;
        this.isMarried = isMarried;
        this.age = age;
        this.eyeColour = eyeColour;
        this.occupation = occupation;
        this.education = education;
        this.phone = phone;

        noOfPersonObjects++;
    }

    public static void printNoOfPeople() {
        System.out.println("Total number of people is " + noOfPersonObjects + ".");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                ", gender='" + gender + '\'' +
                ", eyeColour='" + eyeColour + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", occupation='" + occupation + '\'' +
                ", education='" + education + '\'' +
                ", CNP=" + CNP +
                ", age=" + age +
                ", isMarried=" + isMarried +
                '}';
    }
}




