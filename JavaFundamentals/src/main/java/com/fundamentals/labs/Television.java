package com.fundamentals.labs;

public class Television {

// Task 1
    private int screenSize;
    private double price;
    private int numberOfPorts;
    private boolean isMountable;

    public void setScreenSize(int screenSize){
        this.screenSize = screenSize;
    }
    public int getScreenSize(){
        return screenSize;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public void setNumberOfPorts(int numberOfPorts){
        this.numberOfPorts = numberOfPorts;
    }
    public int getNumberOfPorts(){
        return numberOfPorts;
    }

    public void setIsMountable(boolean isMountable){
        this.isMountable = isMountable;
    }
    public boolean getIsMountable(){
        return isMountable;
    }

// Task 2
    public Television(int screenSize, double price, int numberOfPorts, boolean isMountable) {
        this.screenSize = screenSize;
        this.price = price;
        this.numberOfPorts = numberOfPorts;
        this.isMountable = isMountable;
    }

    public Television(int screenSize, double price){
        this(screenSize, price, 3, true);
    }

// Task 3
    public void turnOn(){
        System.out.println("The " + screenSize + " TV is on");
    }


    public static void main(String[] args) {
        Television myTelevision = new Television(55, 799.99, 4, true);
        System.out.println("Constructor 1");
        System.out.println(myTelevision.getScreenSize());
        System.out.println(myTelevision.getPrice());
        System.out.println(myTelevision.getNumberOfPorts());
        System.out.println(myTelevision.getIsMountable());
        myTelevision.turnOn();
        System.out.println();

        System.out.println("Constructor 2");
        Television otherTelevision = new Television(65, 999.99);
        System.out.println(otherTelevision.getScreenSize());
        System.out.println(otherTelevision.getPrice());
        System.out.println(otherTelevision.getNumberOfPorts());
        System.out.println(otherTelevision.getIsMountable());
        myTelevision.turnOn();
    }

}
