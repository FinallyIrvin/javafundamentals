package com.fundamentals;

import com.fundamentals.labs.StringsLab;
import com.fundamentals.lessons.*;
import com.fundamentals.practice.BottlesOfBeer;

public class Main {

    public static void main(String[] args) {
        // lesson4Example();
        // lesson5Example();
        // lesson6Example();
        // lesson7Example();
        // lesson8Example();
        // basicStatements();
        // exampleBeer();
         stringsLabExercise();

    }

    public static void exampleBeer() {
        BottlesOfBeer beer = new BottlesOfBeer();
        beer.beerSong();
    }

    public static void lesson8Example() {
        Lesson8 myLesson8 = new Lesson8();
        myLesson8.demoWhileLoop(15);
        myLesson8.demoCountdown();
        myLesson8.demoDoWhileLoop();
        myLesson8.demoForLoop(12);
        myLesson8.demoMultiLoop(4,6);
        myLesson8.demoBranching();
    }

    public static void lesson7Example() {
        Lesson7 myLesson7 = new Lesson7();
        myLesson7.demoIfStatement(12,15);
        myLesson7.demoIfElse("baseball", "baseball");
        String result = myLesson7.demoIfElseChain(18);
        System.out.println(result);
        myLesson7.demoIfAndOr(28);
        myLesson7.demoSwitch(30);
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
        myLesson6.demoIncrement();
        myLesson6.demoDecrement();
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

    //Strings Lab Exercise

    // Task 1

    public static void stringsLabExercise() {
        StringsLab myStringsLabs = new StringsLab();
        myStringsLabs.taskOneToLowerCase();
        myStringsLabs.taskOneCharAt();
        System.out.println(myStringsLabs.taskOneLength());

        // task 2

        String taskTwoString = myStringsLabs.taskTwo();
        System.out.println(taskTwoString);
    } // end method

}

