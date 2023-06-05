package com.orange.zooclubservice;

public abstract class Animal {
    private String name;
    protected Animal (String name){
        this.name=name;
    }
    public abstract void eat ();

    public String getName() {
        return this.name;
    }
}
