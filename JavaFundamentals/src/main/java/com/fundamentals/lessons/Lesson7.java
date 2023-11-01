package com.fundamentals.lessons;

/* Conditional Statements */
public class Lesson7 {

    /* Basic if Statements */
    public void demoIfStatement(int value1, int value2) {
      System.out.println("Before if ");
      if(value1 >= value2) {
          System.out.println("Values are greater than or equal ");
      } // end if statement
      System.out.println("After if ");
    } // end method

    /* basic if/else statement */
    public void demoIfElse(String ball1, String ball2) {
        System.out.println("Before if/else");
        if(ball1.equals(ball2)) {
            System.out.println("Both ball1 and ball2 are equal");
        } else {
            System.out.println("Both ball1 and ball2 are not equal.");
        }
        System.out.println("After if/else");
    } // end method

    /* if else chain */
    public String demoIfElseChain(int score) {
        if(score < 20) {
            return "The score is less than 20.";
        } else if(score < 30) {
            return "The score is less than 30, but higher than 19.";
        } else if(score < 40) {
            return "The score is less than 40, but higher than 29.";
        } else {
            return "The score is greater than 39.";
        }
    } // end method

    /* And && or || Logical Statements */
    public void demoIfAndOr(int value) {
        if(value > 100 || value < 50) {
            System.out.println("Value is not between 100 and 50.");
        }

        /* Both if statements are not connected */

        if(value % 2 == 0 && value < 30) {
            System.out.println("The value is less than 30 and an even number.");
        }
    } // end method

    /* Switch statements */
    public void demoSwitch(int score) {
        switch(score) {
            case 20:
                System.out.println("Score is 20.");
                break;
            case 30:
                System.out.println("Score is 30.");
                break;
            case 40:
                System.out.println("Score is 40.");
                break;
            default:
                System.out.println("The score is" + score);
        } // end switch
    } // end method


} // end class
