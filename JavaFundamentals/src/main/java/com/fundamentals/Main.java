package com.fundamentals;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
        houseExample();
        houseReference();
    }

    // This is a single comment
    /*
    * This is a multi-line comment
    * */

    public static void houseExample() {
        House myHouse = new House();
        myHouse.foundationType = "concrete";
        myHouse.doorColor = "Red";
        myHouse.roofStyle = "Shingle";
        myHouse.windowSize = 42;
        myHouse.doorFunction();
        System.out.println(myHouse.doorColor);
    }

    public static void houseReference() {
        House myHouse = new House();
        House otherHouse = new House();
        House  yourHouse = otherHouse;

        myHouse.doorColor = "Red";
        otherHouse.doorColor = "Blue";
        System.out.println(myHouse.doorColor);
        System.out.println(otherHouse.doorColor);
        System.out.println(yourHouse.doorColor);
        yourHouse.doorColor = "Green";
        System.out.println(yourHouse.doorColor);
        System.out.println(otherHouse.doorColor);
    }
}