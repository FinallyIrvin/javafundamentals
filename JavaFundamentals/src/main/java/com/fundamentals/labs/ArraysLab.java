package com.fundamentals.labs;

public class ArraysLab {
    //Task 1

    public void taskOne() {
        System.out.println("Task 1");

        String[] iceCreamFlavors = new String[10];
        iceCreamFlavors[0] = "Vanilla";
        iceCreamFlavors[1] = "Chocolate";
        iceCreamFlavors[2] = "Strawberry";
        iceCreamFlavors[3] = "Pecan";
        iceCreamFlavors[4] = "Mint";
        iceCreamFlavors[5] = "Bubble Gum";
        iceCreamFlavors[6] = "Cookies and Cream";
        iceCreamFlavors[7] = "Mango";
        iceCreamFlavors[8] = "Nut";
        iceCreamFlavors[9] = "Cheesecake";


        for (int i = 0; i < iceCreamFlavors.length; i++) {
            System.out.println(iceCreamFlavors[i]);
        }
    }

    public void taskTwo() {
        System.out.println();
        System.out.println("Task 2");

        int[][] scoresArray = {{26, 40}, {10, 28}, {33, 28}, {30, 34}, {13, 19}, {24, 31},
                {6, 30}, {24, 31}, {26, 23}, {35, 32}, {24, 17}, {40, 9}, {16, 23}, {23, 3},
                {3, 26}, {31, 21}};

        for(int i = 0; i< scoresArray.length; i++) {
                System.out.println("Home: " + scoresArray[i][0] + ", Away: " + scoresArray[i][1]);
            }
        }

    public static void main(String[] args) {
        ArraysLab myArraysLab = new ArraysLab();
        myArraysLab.taskOne();
        myArraysLab.taskTwo();
    }
}