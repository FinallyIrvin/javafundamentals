package com.fundamentals.lessons;

public interface PhoneInterface {
    /* Variables are static and final */
    char STAR = '*';
    char HASH = '#';

    /* Methods are abstract and public */
    void endCall();
    void callerID(String name, int number);

}
