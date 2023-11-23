package com.fundamentals.labs;

public class OLEDTV extends Television {

// Task 1
    private String tvResolution;

    public void resolutionOfTV(){
        System.out.println("The resolution of this TV is " + tvResolution);
    }

    public void gettvResolution(String tvResolution){
        this.tvResolution = tvResolution;
    }
    public String settvResolution(){
        return tvResolution;
    }

    public OLEDTV(int screenSize, double price, int numberOfPorts,
                  boolean isMountable, String tvResolution){
        super(screenSize,price,numberOfPorts,isMountable);
        this.tvResolution = tvResolution;
    }

    @Override
    public void turnOn(){
        System.out.println("The " + tvResolution +  " OLED TV is now on");
    }
}
