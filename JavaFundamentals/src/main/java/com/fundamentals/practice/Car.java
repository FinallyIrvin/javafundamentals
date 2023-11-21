package com.fundamentals.practice;

public abstract class Car {
    private int numberOFDoors;
    private int wheelSize;
    private int horsePower;
    private String exteriorColor;

    public Car() {
        this(4, 17, 300, "White");
    }

    public Car(int numberOFDoors, int wheelSize,
               int horsePower, String exteriorColor) {
        this.numberOFDoors = numberOFDoors;
        this.wheelSize = wheelSize;
        this.horsePower = horsePower;
        this.exteriorColor = exteriorColor;
    }

    public int getNumberOFDoors() {
        return numberOFDoors;
    }

    public int getWheelSize(){
        return wheelSize;
    }

    public int getHorsePower(){
        return horsePower;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void motion() {
        System.out.println("This " + exteriorColor + "car moves. ");
    }


    public void motion(int speed) {
        System.out.println(this + " is moving at " + speed + "mph.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
