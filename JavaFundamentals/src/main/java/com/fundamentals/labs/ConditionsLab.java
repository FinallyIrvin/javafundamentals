package com.fundamentals.labs;

public class ConditionsLab {
    public static void main(String[] args) {
        ConditionsLab myConditionsLab = new ConditionsLab();
        myConditionsLab.taskOne("string", "String");
        String grade = myConditionsLab.taskTwo ('a');
        System.out.println(grade);
    }

    // Task 1
    public void taskOne(String alpha, String bravo) {
        if (alpha.equals(bravo)) {
            System.out.println("Both Values are equal");
        } else {
            System.out.println("Both values are not equal");
        }
    }

    // Task 2
    public String taskTwo(char grade) {
        switch (Character.toUpperCase(grade)) {
            case 'E':
                return "Excellent Grade";
            case 'V':
                return "Very Good Grade";
            case 'G':
                return"Good Grade";
            case 'A':
                return "Average Grade";
            case 'F':
                return "Failed Grade";
            default:
                return  "Not a valid grade";
        }
    }
}
