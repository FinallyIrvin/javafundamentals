package com.fundamentals.lessons;

/* Primitive Data Types */
/* These data types don't share state like objects.*/
public class Lesson5 {

    /* Byte has a value range of -128 to 127 */
    byte myByte = 9;

    /* Short has a value range of -32768 to 32767*/
    short myShort = 235;

    /* Integer has a value range of
    -2,147,483,648 to 2,147,483,647 */
    int myInt = 2345;

    /* Long has a value range of
    * -9,223,372,836,854,75,898 to 9,223,372,836,854,775,898*/
    long myLong = 2684L;

    /* Double has a value range of 1.7E-308 to 1.7E+384 */
    double myDouble = 84.98;
    double myOtherDouble = 36.43d; // D or d

    /* Float has a value range of 3.4E-38 to 3.48E+38 */
    float myFloat = 34.53F; // F or f

    /* Boolean has a value of true or false */
    boolean isMyBoolean = true;

    /* Number Systems - Value of 26 */
    int myDecimal = 26; // standard
    int myHexadecimal = 0x1a; // hexadecimal
    int myBinary = 0b1_1010; // binary
    int myOctal = 032; // octal

    /* Scientific Notation uses E or 3 */
    double myNotation = 23.65E8;

    /* Use underscores for more readability */
    long usingUnderscores = 4_568_987_367L;

    /* Local variable can only be accessed within the method */
    public void showLocalExample() {
        int able = 20;
        System.out.println(able);
    }

    /* Instance variable can be accessed within the class*/
    public int showInstanceExample() {
        return myOctal;
    }

    /* Data type conversion is the concept of converting between
    different primitive types. When going from a floating point
    number to an integer based number, there is no rounding.
    The value is truncated.
     */
    /* Implicit or Widening type conversion is done when two
    data types automatically convert. */
    public void exampleImplicit(long num2) {
        long converted = myInt;
        float value = num2;
        short small = myByte;
        System.out.println("My samples are " + converted + " & " + value);
        System.out.println("My short is " + small );
    } // end method

    /* Explicit or Narrowing type conversion is done when two
    data types convert, but require a direct boxing affect. This
    is because a larger data type is converting to a smaller one.
    This could result in precision loss. */
    public void exampleExplicit() {
        long sample2 = (long)myDouble;
        int sample3 = (int)myLong;
        byte sample4 = (byte)myFloat;
        System.out.println("Sample2 = " + sample2);
        System.out.println("Sample3 = " + sample3);
        System.out.println("Sample4 = " + sample4);
    } // end method

} // end class
