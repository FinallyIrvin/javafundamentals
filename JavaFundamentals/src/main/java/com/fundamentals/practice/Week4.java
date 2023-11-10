package com.fundamentals.practice;

import com.fundamentals.Main;

import java.util.Scanner;

/* Practice for Lessons 9 and floating
* point decimal places */
public class Week4 {

    double vision = 325.734568;
    int test = 467;

    /* String.format() approach */
    public void demoStringFormat() {
        String result = String.format("%.1f", vision);
        System.out.println(result);
    }

    /* Using Math.round() */
    public void demoRound() {
        double result = Math.round(vision * 1000) / 1000.0;
        System.out.println(result);
    }

    /* Array Practice */
    /* Ask the user to provide 10 numbers. We need
    to find the largest and smallest number. From the array. */
    public void demoSmallToLarge() {
        Scanner init = new Scanner(System.in);
        int[] values = new int[10];
        for(int i = 0; i < values.length; i++) {
            System.out.println("Enter a number for values["+i+"]");
            values[i] = init.nextInt();
        }

        int largest = values[0];
        int smallest = values[0];

        for(int i = 0; i < values.length; i++) {
            if(values[i] > largest) {
                largest = values[i];
            }
            if(values[i] < smallest) {
                smallest = values[i];
            }
        }

        System.out.println("Largest is " + largest +
                " and smallest is " + smallest);

    }

    public static void main(String[] args) {
        Week4 week4 = new Week4();
        // week4.demoStringFormat();
        // week4.demoRound();
        week4.demoSmallToLarge();
    }
}
