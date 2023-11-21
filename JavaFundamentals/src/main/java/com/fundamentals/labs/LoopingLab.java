package com.fundamentals.labs;

public class LoopingLab {
    public static void main(String[] args) {
        LoopingLab myLoopingLap = new LoopingLab();
        myLoopingLap.taskOne();
        myLoopingLap.taskTwo();
    }

    public void taskOne () {
        int count = 0;
        do{
                if (count == 5){
                    System.out.println("Five");
                } else if (count == 10){
                    System.out.println("Ten");
                } else if (count == 15) {
                    System.out.println("Fifteen");
                } else {
                    System.out.println(count);
                }
        count++;
        } while(count <= 15);
    }

    public void taskTwo () {
        System.out.println();
        System.out.println("Task 2");
        for(int i = 0; i <= 30; i++) {
            if(i % 3 == 0 && i != 0 ) {
                System.out.println(i);
            }
        }
    }
}