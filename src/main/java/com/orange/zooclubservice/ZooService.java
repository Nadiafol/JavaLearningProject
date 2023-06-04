package com.orange.zooclubservice;

import java.rmi.MarshalException;

public class ZooService {
    public static void main(String[] args) {
        Animal dog = new Dog("Mars");
        Dog dog2 = new Dog("Twix");
        Cat cat=new Cat("Bounty");

        dog.eat();
        dog2.makeSound();
        dog2.eat();
        cat.makeSound();
        cat.eat();
    };
};
