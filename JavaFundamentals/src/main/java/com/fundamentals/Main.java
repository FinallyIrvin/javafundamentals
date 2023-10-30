package com.fundamentals;

import com.fundamentals.lessons.Lesson4;
import com.fundamentals.lessons.Lesson5;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello Java!");
        // houseExample();
        // houseReference();
        // lesson4Example();
        lesson5Example();
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
    }
}