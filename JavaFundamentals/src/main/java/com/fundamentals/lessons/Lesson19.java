package com.fundamentals.lessons;

import com.fundamentals.House;

/* Writing Unit Test */
public class Lesson19 {

    public double calculateArea ( double radius) {
        return Math.PI * radius * radius;
    }

    public char[] myCharArrayExample() {
        return new char[] {'U', 'n', 'i', 't', 'T','e', 's', 't'};
    }

    public boolean isGreaterExample(int valueA, int valueB) {
        return valueA > valueB;
    }

    public House myHouseExample(House house) {
        return house;
    }
}
