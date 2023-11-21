package com.fundamentals;

public class House {
    private String foundationType;
    private String roofStyle;
    private String doorColor;
    private int windowSize;

    public House() {
        this("Cinder Block", "Steel", "Grey", 35);
    }

    public House(String foundationType, String roofStyle) {
        this(foundationType, roofStyle, "Red", 41);
    }

    public House(String foundationType, String roofStyle, String doorColor, int windowSize) {
        this.foundationType = foundationType;
        this.roofStyle = roofStyle;
        this.doorColor = doorColor;
        this.windowSize = windowSize;
    }

    /* Setters and Getters */
    public void setFoundationType(String foundationType) {
        this.foundationType = foundationType;
    }

    public String getFoundationType() {
        return foundationType;
    }

    public void setRoofStyle(String roofStyle) {
        this.roofStyle = roofStyle;
    }

    public String getRoofStyle(){
        return roofStyle;
    }

    public void setDoorColor(String doorColor) {
        this.doorColor = doorColor;
    }

    public String getDoorColor() {
        return doorColor;
    }

    public void setWindowSize(int windowSize) {
        this.windowSize = windowSize;
    }

    public int getWindowSize(){
        return windowSize;
    }

    public void doorFunction() {
        System.out.println("This door opens.");
    }

    public void doorFunction (String message){
        System.out.println("The " + doorColor + " door " + message);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - Foundation: "
                + getFoundationType() +
                ", Roof Style: " + getRoofStyle() +
                ", Door Color: " + getDoorColor() +
                ", Window Size: " + getWindowSize();
    }
}
