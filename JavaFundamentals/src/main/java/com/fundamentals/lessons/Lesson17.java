package com.fundamentals.lessons;

/* Enumerations */
public class Lesson17 {
    public enum IceCreamFlavors {  VANILLA, CHOCOLATE,
        STRAWBERRY, ROCK_ROAD}

    public String myFavoriteFlavor(IceCreamFlavors flavor) {
        String msg = "My favorite flavor is ";
        switch (flavor) {
            case VANILLA:
                msg += IceCreamFlavors.VANILLA.
                        toString().toLowerCase();
                break;
            case CHOCOLATE:
                msg += "chocolate and a little peanut butter.";
                break;
            case STRAWBERRY:
                msg += IceCreamFlavors.STRAWBERRY.
                        toString().toLowerCase();
                break;
            default:
                msg += "rocky road";
                break;
        }
        return msg;
    }

}
