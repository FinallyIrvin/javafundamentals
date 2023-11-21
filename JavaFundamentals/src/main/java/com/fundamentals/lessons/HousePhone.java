package com.fundamentals.lessons;

/* Subclass of Telephone*/

public class HousePhone extends Telephone {
    public HousePhone(int volume, int[] numberKeys,
                      int sendKey, String screen) {
        super(volume, numberKeys, sendKey, screen);
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving Phone Call");
    }

    @Override
    public void sendCall() {
        System.out.println("Sending Phone Call");
    }

    @Override
    public void callerID(String name, int number) {
        System.out.println(name + " - " + number);
    }
}
