package com.fundamentals.lessons;
/* Looping Statements */
/* Looping statements require 3
key factors; Initialized variable,
condition & Increment/Decrement */
public class Lesson8 {

    /* While Loop */
    public void demoWhileLoop(int total) {
        // Initialized variable
        int able = 0;
        // Condition
        while(able <= total) {
            System.out.print(able + ", ");
            // Increment
            able++;
        } // end while
        System.out.println();
     } // end method

    public void demoCountdown() {
        int count = 10;
        while (count >= 0) {
            System.out.print(count + ", ");
            count --;
        } // end while
        System.out.println();
    } // end method

    /* Do while loop */
    public void demoDoWhileLoop() {
        int charlie = 0;
        do{
            if(charlie % 2 == 0) {
                System.out.print(charlie + " ");
            } // end if
            charlie++;
        } while(charlie < 20);
        System.out.println();
    } // end method

    /* For Loop */
    public void demoForLoop(int total) {
        for(int i = 0; i < total; i++){
            System.out.print(i + " ");
        } // end for loop
        System.out.println();
    } // end class


    public void demoMultiLoop(int first, int second) {
        for(int i =0; i < first; i++) {
            for(int j = 0; j< second; j++) {
                System.out.print("(" + i + "," + j + ")");
            } // end inner loop
            System.out.println();
        } // end outer loop
    } // end method

    /* Branching */
    public void demoBranching() {
        for(int i = 0; i < 6; i++) {
            if(i == 2) {
                continue;
            } // end if
            if (i == 4) {
                System.out.println("The Loop Breaks.");
                break;
            } // end if
            System.out.println(i);
        } // end for loop
    } // end method

} // end class
