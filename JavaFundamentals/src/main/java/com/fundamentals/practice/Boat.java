package com.fundamentals.practice;

import com.fundamentals.House;

public class Boat {

    private String rudderStyle;
    private String anchorType;
    private int deckSize;

    public Boat(){
        this("outboard","Grapnel", 24 );
    }

    public Boat(String rudderStyle, String anchorType){
        this(rudderStyle, anchorType, 32);
    }

    public Boat(String rudderStyle, String anchorType, int deckSize) {
        this.rudderStyle = rudderStyle;
        this.anchorType = anchorType;
        this.deckSize = deckSize;
    }

    public void setRudderStyle(String rudderStyle) {
        this.rudderStyle = rudderStyle;
    }

    public String getRudderStyle() {
        return rudderStyle;
    }

    public void setAnchorType(String anchorType) {
        this.anchorType = anchorType;
    }

    public String getAnchorType(){
        return anchorType;
    }

    public void setDeckSize(int deckSize) {
        this.deckSize = deckSize;
    }

    public int getDeckSize(){
        return deckSize;
    }

    public void motionFunction(){
        System.out.println("The boat moves.");
    }

    public void motionFunction(String message) {
        System.out.println("the " + rudderStyle + " rudder boat " + message);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " Rudder Style: " + getRudderStyle() +
                ", Anchor Type: " + getAnchorType() +
                ", Deck Size: " + getDeckSize();
    }

}
