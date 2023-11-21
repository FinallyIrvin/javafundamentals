package com.fundamentals;

/* Subclass (child) of House */
public class Condo extends House {

    private String balconyType;

    public Condo() {
        this("Wood Railed");
    }

    public Condo(String balconyType) {
        this("Cinder Block", "Flat", "Blue", 43, balconyType);
    }

    public Condo(String foundation, String roofStyle, String doorColor,
                 int windowSize, String balconyType){
        super(foundation, roofStyle, doorColor, windowSize);
        this.balconyType = balconyType;

    }

    public String getBalconyType(){
        return balconyType;
    }

    public void setBalconyType(String balconyType) {
        this.balconyType = balconyType;
    }

    public void maintenance () {
        System.out.println("We will fix your " +
                balconyType + " balcony as soon as we can.");
    }

    @Override
    public void doorFunction() {
        System.out.println("My condo door slides open and close.");
    }


    @Override
    public String toString() {
        return super.toString() + ", Balcony Type: " + getBalconyType();
    }
}
