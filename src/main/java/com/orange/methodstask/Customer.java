package com.orange.methodstask;

public class Customer {
    private String name;
    private String email;
    private int age;

    public Customer(String name, String email, int age) {
        this.name = name;
        this.email = email;
        if ((age <= 1) || (age > 127)) {
            System.out.println("The age is invalid");
            this.age = 0;
        }else {
            this.age=age;
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return this.email;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public void setAge(int newAge) {
        if ((newAge <= 1) || (newAge > 127)) {
            System.out.println("This age is invalid");
        } else {
            this.age = newAge;
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}

