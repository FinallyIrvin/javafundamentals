package com.fundamentals.labs;

public class NumberLab {

    // Task 1 Data
    int myBinary = 0b1_1101;
    int myHexadecimal = 0x1D;
    int myOctal = 035;

    // Task 2 Data
    byte myByte = 1;
    short myShort = 100;
    int myInt = 22;

    // Task 3 Data
    double myDouble = 87.3;
    float myFloat = 34.4F;
    long myLong = 5644L;
    // Task 1

    public void myTaskOneExample() {
       System.out.println(myBinary);
       System.out.println(myHexadecimal);
       System.out.println(myOctal);
    }

    // Task 2

    public void myTaskTwoExample() {
        int taskTwoExample1 = (int) myByte;
        long taskTwoExample2 = (long) myShort;
        float taskTwoExample3= (float) myInt;
        System.out.println(taskTwoExample1);
        System.out.println(taskTwoExample2);
        System.out.println(taskTwoExample3);

    }

    // Task 3
    public void myTaskThreeExample() {
        long taskThreeExample1 = (long) myDouble;
        int taskThreeExample2 = (int) myFloat;
        short taskThreeExample3 = (short) myLong;
        System.out.println(taskThreeExample1);
        System.out.println(taskThreeExample2);
        System.out.println(taskThreeExample3);
    }
}
