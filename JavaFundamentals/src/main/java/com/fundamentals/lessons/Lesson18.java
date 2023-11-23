package com.fundamentals.lessons;

import com.fundamentals.House;

/* Exception Handling */
public class Lesson18 {

    House ranch;

    /* throw keyword */
    public void sampleThrow(int value1, int value2){
        if(value2 != 0) {
            System.out.println(value1/ value2);
        } else{
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    /* Throws keyword */

    public void exampleThrows() throws NullPointerException {
        System.out.println(ranch.getWindowSize());
    }

    public void myArrayExeption(){
        String [] name = {"David", "Jody", "Kate"};
        String[] values = {"243", "424", "542"};
        try {
            byte b = Byte.parseByte(values[1]);
            System.out.println(b);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Please provide at least 1 argument.");
        } catch (NumberFormatException nf) {
            System.out.println("That is not a number.");
        } catch (StackOverflowError soe) {
            System.out.println("You have given me more than a byte.");
        } catch (Exception e) {
            System.out.println("I dunno what you did" + e.getMessage());
        }
    }

    /* try/catch/finally */

    public void exampleFinally(){
        try {
            System.out.println(ranch.getWindowSize());
        } catch (NullPointerException np) {
            System.out.println("A null pointer was called " +
                    np.getMessage());
        } finally {
            System.out.println("The finally block was called.");
        }
    }
}
