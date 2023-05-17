package com.orange.accessmodifiers;

import com.orange.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person alexaV = new Person(2000034456780L);
        alexaV.name = " Aleva Vicol";
        alexaV.address="Gilbore street 123, Chisianu";
        alexaV.gender= "Male";
        alexaV.surname = "Vicol";
        alexaV.nationality = "Moldovan";
        System.out.println(alexaV.toString());



        Person valeriaF = new Person(2000030045678L, "Valeria Fira", true, 34, "brown", "Freelancer", "High School", 67490766L);
        valeriaF.address = "Alba Iulia street 45, Nisporeni";
        valeriaF.gender = "Female";
        valeriaF.surname = "Fira";
        valeriaF.nationality = "Romanian";
        System.out.println(valeriaF.toString());


        Person igorR = new Person (200000450035L, "Igor Ram", false, 23, "green", "Technician", "Master", 67345299L);
        igorR.address = "Columna street 234, Hincesti";
        igorR.gender = "Male";
        igorR.surname = "Ram";
        igorR.nationality = "Moldovan";
        System.out.println(igorR.toString());

        Person gabiT = new Person (2000040056077L, "Gabi Tre", true, 45, "Blue", "Tester", "Bachelor", 68923077L);
        gabiT.address = "Arhip street 231, Chisinau";
        gabiT.gender = "Male";
        gabiT.surname = "Tre";
        gabiT.nationality = "Moldovan";
        System.out.println(gabiT.toString());


        Person violaM = new Person (2000309056077L, "Viola Mei", true, 29, "Brown", "QA automation", "Master", 69232899L);
        violaM.address = "Racu 34 street, Chisinau";
        violaM.gender = "Female";
        violaM.surname = "Mei";
        violaM.nationality = "Moldovan";
        System.out.println(violaM.toString());
        Person.printNoOfPeople();
    }
}
