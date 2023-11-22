package com.fundamentals.labs;


public class StaticLab {

    static double voltage(double current, double resistance) {
        return current * resistance;
    }

    static double current(double voltage, double resistance) {
        return voltage / resistance;
    }

    static double resistance(double voltage, double current) {
        return voltage / current;
    }

    public static void main(String[] args) {
        System.out.println(StaticLab.voltage(10.0, 30.0));
        System.out.println(StaticLab.current(300.0,30));
        System.out.println(StaticLab.resistance(300.0,10.0));
    }
}
