package com.fundamentals.labs;

// Task 1

public class StringsLab {

    String taskOneString = "This is the sentence for my example.";

    public int taskOneLength() {
        return taskOneString.length();
    }

    public void taskOne(String word) {
        System.out.println(word.toLowerCase());
        System.out.println(word.charAt(1));
    }

    // Task 2

     public String taskTwo() {
         return "Jack and Jill went up the hill \nto fetch a pail of water.\n" +
                 "Jack fell down and broke his crown \nand Jill came tumbling " +
                 "after. \n";
     }
}

