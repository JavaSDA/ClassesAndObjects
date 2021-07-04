package com.company;

public class Bird {
    // A constructor is simply a construct to build our objects.

    // Field or attributes for our bird
    private String NAME;
    private String COLOR;

    // A constructor to allow us create a name and color
    // for our bird when the bird is created

    // Constructor overloading
    // This allows you to create multiple definitions of
    // constructor as long as the are differentiated by the parameters they
    // accept.
//    public Bird() {
//
//    }

    public Bird(String name, String color) {
        this.NAME = name;
        this.COLOR = color;
    }

    // Allows our bird to sing
    public void sing() {
        System.out.println(this.NAME + " is singing");
    }

    // Allows our bird to fly
    public void fly() {
        System.out.println(this.NAME + " is flying");
    }

    public String getCOLOR() {
        return this.COLOR;
    }

    public void setCOLOR(String color) {
        this.COLOR = color;
    }

    public String getNAME() {
        return this.NAME;
    }

    public void setNAME(String name) {
        this.NAME = name;
    }
}
