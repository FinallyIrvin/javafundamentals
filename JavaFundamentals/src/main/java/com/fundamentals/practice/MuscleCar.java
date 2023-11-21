package com.fundamentals.practice;

public class MuscleCar extends SportsCar{

    public MuscleCar() {
        this(22, 550, "Black", "Halogen");
    }

    public MuscleCar(int wheelSize, int horsePower,
                     String exteriorColor, String headlampType) {
        super(wheelSize, horsePower, exteriorColor, headlampType);
    }
}
