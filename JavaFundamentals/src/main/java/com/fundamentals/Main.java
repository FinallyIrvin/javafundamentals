package com.fundamentals;

import com.fundamentals.lessons.Lesson4;
import com.fundamentals.lessons.Lesson5;
import com.fundamentals.lessons.Lesson6;

public class Main {

    public static void main(String[] args) {
        // lesson4Example();
        // lesson5Example();
        // lesson6Example();
        basicStatements();
    }

    public static void lesson6Example(){
        Lesson6 myLesson6 = new Lesson6();
        myLesson6.demoArithmetic();
        myLesson6.demoModulus(3);
        myLesson6.demoMathOrder();
        //myLesson6.demoScanner();
        myLesson6.demoAssignment(5, 7);
        myLesson6.demoRealtionalEquals(12, 13);
        myLesson6.demoRelationalGreater(34, 42);
        myLesson6.demoEquals();
        myLesson6.demoLogicalAnd(10, 11, 12);
        myLesson6.demoLogicalOr(13, 14, 15);
    }

    public static void lesson5Example(){
        Lesson5 myLesson5 = new Lesson5();
        myLesson5.showLocalExample();
        System.out.println(myLesson5.showInstanceExample());
        myLesson5.exampleImplicit(7_536_842_983_214L);
        myLesson5.exampleExplicit();
    }

    public static void  lesson4Example() {
        Lesson4 myLesson = new Lesson4();
        myLesson.demoStrings();
        myLesson.demoCharAt("Happy Day");
        String myJoin = myLesson.demoConcat();
        System.out.println(myJoin);
        myLesson.demoEquals("Something");
        myLesson.demoCase();
        System.out.println(myLesson.demoLength());
        System.out.println(myLesson.demoReplace());
        myLesson.demoStringBuilder("black", "tacos");
        myLesson.demoChar();
        String myEscape = myLesson.demoEscapeSequences();
        System.out.println(myEscape);

    }

    // This is a single comment
    /*
    * This is a multi-line comment
    * */

    public static void houseExample() {
        House myHouse = new House();
        myHouse.foundationType = "concrete";
        myHouse.doorColor = "Red";
        myHouse.roofStyle = "Shingle";
        myHouse.windowSize = 42;
        myHouse.doorFunction();
        System.out.println(myHouse.doorColor);
    }

    public static void houseReference() {
        House myHouse = new House();
        House otherHouse = new House();
        House yourHouse = otherHouse;

        myHouse.doorColor = "Red";
        otherHouse.doorColor = "Blue";
        System.out.println(myHouse.doorColor);
        System.out.println(otherHouse.doorColor);
        System.out.println(yourHouse.doorColor);
        yourHouse.doorColor = "Green";
        System.out.println(yourHouse.doorColor);
        System.out.println(otherHouse.doorColor);
    } // end method

    /* Writing Basic Statements */

    public static void basicStatements() {
        System.out.println("This is my first sentence.");
        System.out.println("I am new to Java");
        System.out.println("This Java course is cool.");
        System.out.println("I am learning stuff every day.");
    } // end method
}