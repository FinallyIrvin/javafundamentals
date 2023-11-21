package com.fundamentals.practice;

public class SpeedBoat extends Boat {

    private String engineType;

    public SpeedBoat (){
        this("Outboard");
    }

    public SpeedBoat(String engineType) {
        this("Skeg", "Zy-6", 34, engineType);
    }

    public SpeedBoat(String rudderStyle, String anchorType, int deckSize,
                     String engineType){
        super(rudderStyle, anchorType,deckSize);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void
    engineStartFunction(){
        System.out.println("Your " + engineType + " engine type boat is starting up.");
    }

    @Override
    public void motionFunction() {
        System.out.println("The boat moves forward");
    }

    @Override
    public String toString() {
        return super.toString() + ", Engine Type: " + getEngineType();
    }
}
