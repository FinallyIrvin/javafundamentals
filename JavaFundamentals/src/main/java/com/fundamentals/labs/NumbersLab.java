package com.fundamentals.labs;

public class NumbersLab {

    /* Task 1 */

    int myBinary = 0b1_1101;
    int myHexadecimal = 0x1D;
    int myOctal = 035;

    public void myTaskOneExample() {
        System.out.println(myBinary);
        System.out.println(myHexadecimal);
        System.out.println(myOctal);
    } // end method

    /* Task 2 */

    byte myByte = 1;
    short myShort = 100;
    int myInt = 22;

    public void myTaskTwoExample() {
        int taskTwoExample1 = myByte;
        long taskTwoExample2 = myShort;
        float taskTwoExample3= myInt;
        System.out.println(taskTwoExample1);
        System.out.println(taskTwoExample2);
        System.out.println(taskTwoExample3);
    } // end method

    /* Task 3 */

    double myDouble = 87.3;
    float myFloat = 34.4F;
    long myLong = 5644L;


    public void myTaskThreeExample() {
        long taskThreeExample1 = (long) myDouble;
        int taskThreeExample2 = (int) myFloat;
        short taskThreeExample3 = (short) myLong;
        System.out.println(taskThreeExample1);
        System.out.println(taskThreeExample2);
        System.out.println(taskThreeExample3);
    } // end method

    public static void main(String[] args) {
        numbersLabExercise();
    }

        public static void numbersLabExercise() {
            NumbersLab myNumbersLab = new NumbersLab();
            myNumbersLab.myTaskOneExample();
            myNumbersLab.myTaskTwoExample();
            myNumbersLab.myTaskThreeExample();

    }
} // end class
