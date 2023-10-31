package com.fundamentals.lessons;
import java.util.Scanner;

/* Operators */
public class Lesson6 {

    int value1 = 23, value2  = 45;

    /* Arithmetic Operators */
    public void demoArithmetic() {
        System.out.println(value1 + value2);
        System.out.println(value2 - value1);
        System.out.println(value1 * value2);
        System.out.println(value2 / value1);
    } // end method

    public void demoModulus(int num) {
        int total = value2 % num;
        System.out.println(total);
    } // end method

    /* PEMDAS */
    public void demoMathOrder() {
        double total = 20 - 42 / 3.7 + 8.2 * 19 - 32;
        System.out.println(total);
    } // end method

    /* Using Scanner to get user input. */
    public void demoScanner() {
        int num1, num2, total;
        System.out.println("Enter two integers to" +
                " calculate their sum.");
        Scanner userInput = new Scanner(System.in);
        num1 = userInput.nextInt();
        num2 = userInput.nextInt();
        total = num1 + num2;
        System.out.println("The total of the problem is " + total);
    } // end method

    /* Assignment Operator */
    public void demoAssignment(int able, int may) {
        able += may;
        System.out.println("+= operator " + able);
        may -= able;
        System.out.println("-= operator " + may);
        able *= may;
        System.out.println("*= operator " + able);
        able /= may;
        System.out.println("/= operator " + able);
        able %= may;
        System.out.println("%= operator " + able);
    } // end method

    /* Relational Operators */
    /* Values return a boolean answer */
    public void demoRealtionalEquals(int echo, int foxtrot) {
        boolean isEqual = echo == foxtrot;
        boolean isNot = echo != foxtrot;
        System.out.println("is Equal " + isEqual);
        System.out.println("isNot " + isNot);
    } // end method

    public void demoRelationalGreater(int golf, int hotel) {
        boolean isGreater = golf > hotel;
        boolean isLess = hotel <= golf;
        System.out.println("is greater " + isGreater);
        System.out.println("isLess " + isLess);
    } // end method

    public void demoEquals() {
        String name = new String("Dave");
        String name2 = new String("Dave");
        String name3 = name2;

        boolean isEqualOperator = name == name2;
        System.out.println("== " + isEqualOperator);
        boolean isEqualMethod = name2.equals(name3);
        boolean isEqualCompare = name.equals(name2);
        System.out.println("isEqualMethod " + isEqualMethod);
        System.out.println("isEqualCompare " + isEqualCompare);
    } // end method

    /* Logical Operators */
    /* The logical Operator && means that both
    conditions must be true for the result to
    be true. */
    public void demoLogicalAnd(int alpha, int beta, int charlie) {
        boolean logicAnswer = (alpha != beta) && (charlie > beta);
        System.out.println("Logical Operator And " + logicAnswer);
    } // end method

    /* The logical operator || means that only 1
    condition must be true for the result to be
    true */
    public void demoLogicalOr(int delta, int echo, int fox) {
        boolean logicAnswer = (delta != echo) || (fox > echo);
        System.out.println("Logical Operator Or " + logicAnswer);
    } // end method

} // end class
