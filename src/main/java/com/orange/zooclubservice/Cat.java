package com.orange.zooclubservice;

public class Cat extends Animal implements AnimalInterface {
    public Cat (String name){
        super (name);
    }

    @Override
    public void makeSound(){
        System.out.println("Cat "+getName()+ " says: miau- miua!");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " eats mouses.");
    }
}
