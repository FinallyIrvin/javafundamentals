package com.fundamentals.practice;

public class SportsCar extends Car {

    private String headLightType;

    public SportsCar() {
        this("Flip Up");
    }

    public SportsCar(String headLightType) {
        this(20, 450, "Red", headLightType);
    }

    public SportsCar(int wheelSize, int horsePower,
                     String exteriorColor, String headLightType) {
        super(2, wheelSize, horsePower, exteriorColor);
        this.headLightType = headLightType;
    }

    public String getHeadLightType() {
        return headLightType;
    }

    public void launchMode(int time) {
        System.out.println("My car will launch in " + time + " seconds.");
    }

}
