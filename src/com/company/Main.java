package com.company;



public class Main {

    public static void main(String[] args) {
        // Classes and Objects & // Static methods and classes
        // A class is a blueprint for creating an objects


        Car car = new Car();


//        System.out.println(car.getCOLOR());
//        car.setCOLOR("Red");
//        System.out.println(car.getCOLOR());
//        car.startMaserati();

//        car.startEngine(false);
//        car.stopEngine();

        //
        //Create a class that models a bird
        // The bird should have a color
        // The bird should be able to sing
        // The bird should be able to fly.
        // The bird should be able to walk.

        Bird bird = new Bird("Betty", "blue");
//        bird.setNAME("Nate");
//        bird.setCOLOR("Green");

        bird.fly();
    }
}
