package com.fundamentals.practice;

/* These practice tasks will represent
Lesson's 7 and 8 */
public class Week3 {
    /* Write a method that takes a char
    data type and a String return type. Using
    a switch, write
    case statements should look for the
    letter representing the day of the week:
    M, T, W, R, F
    Default value represents the weekend */
     /* Account for upper and lowercase char. */
    public String dayOfWeek(char day) {
        switch (Character.toUpperCase(day)) {
            case 'M':
                return "Monday";
            case 'T':
                return "Tuesday";
            case 'W':
                return "Wednesday";
            case 'R':
                return "Thursday";
            case 'F':
                return "Friday";
            default:
                return "The weekend";
        } // end switch
    } // end method

    /* Write a method with a void return and no
    parameters. Write a for loop that will print out
    the single characters of a string.
     */
    public void stringLoop() {
        String delta = "Something";
        for(int i = 0; i < delta.length(); i++) {
            System.out.println(delta.charAt(i));
        } // end for loop
    } // end method

    /*
    Assigning the below math problems to multiple variables.
    Use pemdas to ge the below output
    256+ 365 / 10 + 89 -16

    answers
    243.0
    365
     */
    public void solveProblem() {
        double sum1 = 256 + 365 / (10 + 89) - 16;
        double sum2 = 256 + 365 / 10 + 89 - 16;

        System.out.println(sum1);
        System.out.println(sum2);
    }

    /* Write a method with no parameters and
    a void return type. Using for loops, output
    all the prime numbers from 0 to 100. */
    public void loopPrimes() {
        int counter;
        for(int i = 0; i <= 100; i++) {
            counter = 0;
            for(int k = 1; k <= i; k++) {
                if(i % k == 0) {
                    counter++;
                }
            }
            if(counter == 2) {
                System.out.print(i + " ");
            }
        } // end outer loop
    }

} // end class
