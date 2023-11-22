package com.fundamentals.lessons;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/* Using Static */
public class Lesson11 {
    // Constant variables
    private static final int FREEZING = 32;
    private static final double KELVIN_UNIT = 273.15;

    // Static variables
    public static int num;
    public static String word;

    static {
        num = 97;
        word = "Temperature";
        System.out.println("Static Block 1 " +
                num + " " + word);;
    }

    static {
        num = 234;
        System.out.println("Static Block 2 " +
                num + " " + word);
    }



    // default constructor
    private Lesson11() {}

    /* Static Methods */
    public static double celsiusToFahrenheit( double celsius) {
        double total = (celsius * 9 / 5) + FREEZING;
        return refineResult(total);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double total = (fahrenheit - FREEZING) * 5 / 9;
        return refineResult(total);
    }

    public static String celsiustoKelvin(double celsius) {
        double total = (refineResult(celsius + KELVIN_UNIT));
         // return total + '\u212A';
        return String.valueOf(total) + '\u212A';
    }

    public static String kelvinToCelsius(double kelvin) {
        double total = (refineResult(kelvin - KELVIN_UNIT));
        return String.valueOf(total) + '\u2103';
    }

    public static String fahrenheitToKelvin(double fahrenheit) {
        double  total = refineResult(fahrenheitToCelsius(fahrenheit) + KELVIN_UNIT);
        return String.valueOf(total) + '\u212A';
    }

    public static String kelvinToFahrenheit(double kelvin) {
        double celsius = kelvin - KELVIN_UNIT;
        double total = refineResult(celsiusToFahrenheit(celsius));
        return String.valueOf(total) + '\u2109';
    }


    private static double refineResult(double value) {
        DecimalFormat valueFormat = new DecimalFormat("0.0");
        valueFormat.setRoundingMode(RoundingMode.FLOOR);
        return Double.parseDouble(valueFormat.format(value));
    }
}
