package com.fundamentals.labs;

public class SmartTV extends Television {

// Task 1
    private String smartTVApp;

    public void watchNetflix() {
        System.out.println("This Smart TV has " + smartTVApp +
                " available.");
    }

    public void setSmartTVApp(String smartTVApp) {
        this.smartTVApp = smartTVApp;
    }
    public String getSmartTVApp(){
        return smartTVApp;
    }

    public SmartTV(int screenSize, double price, int numberOfPorts,
                   boolean isMountable, String smartTVApp){
        super(screenSize,price,numberOfPorts,isMountable);
        this.smartTVApp = smartTVApp;
    }

    @Override
    public void turnOn(){
        System.out.println("The TV can be turned on with your phone");
    }


}
