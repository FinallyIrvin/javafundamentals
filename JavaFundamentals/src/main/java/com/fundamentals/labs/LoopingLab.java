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
            if(count % 5 != 0 || count == 0){
                System.out.println(count);
            } if (count == 5){
                System.out.println("Five");
            } if (count == 10){
                System.out.println("Ten");
            } if (count == 15) {
                System.out.println("Fifteen");
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