package com.fundamentals.labs;

import java.util.Scanner;

public class OperatorsLab {
    public static void main(String[] args) {
        OperatorsLab myOperatorsLab = new OperatorsLab();
        myOperatorsLab.taskOne();
        myOperatorsLab.taskTwo(10, 2);
        myOperatorsLab.taskThree();

    }

    // Task 1
    public void taskOne() {
        int value1 = 10, value2 = 32, value3 = 12, value4 = 3;
        int one = value1 + value2 * value3 / value4;
        int two = (value1 + value2) * value3 / value4;
        System.out.println(one);
        System.out.println(two);
    }

    // Task 2
    public void  taskTwo(int alpha, int bravo) {
        alpha += bravo;
        System.out.println(alpha);
        alpha *= bravo;
        System.out.println(alpha);
        alpha %= bravo;
        System.out.println(alpha);
    }

     // Task 3
    public void taskThree() {
        int localVariable = 5, num1, total;
        System.out.println("Enter a number");
        Scanner userInput = new Scanner(System.in);
        num1 = userInput.nextInt();
        total = num1 % localVariable;
        System.out.println("User value % " + total);
    }
}
