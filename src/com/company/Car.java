package com.company;



public class Car {
    // Give our car features
    // To create attributes, create class variables
    private static String COLOR = "Green";
    static int NO_OF_SEATS = 4;

    // An inner class is a class inside of another class
    // and a static inner class is a class with only one instance and is an inner class
//    class Maserati { // static inner class
//        int NO_OF_SEATS = 4;
//
//        public void startEngine() {
//            System.out.println("Vrrrrooooom");
//        }
//    }

//    public void startMaserati() {
//        Maserati maserati = new Maserati();
//        maserati.startEngine();
//    }

    public void startEngine(boolean key) {
        if (key) {
            System.out.println("Engine switched on!");
        } else {
            stopEngine();
            System.out.println("Please put your key");
        }
    }

    public void stopEngine() {
        System.out.println("Engine switched off!");
    }

    // getter
    public String getCOLOR() {
        return COLOR;
    }

    // setter
    public void setCOLOR(String color) {
        COLOR = color;
    }
}
