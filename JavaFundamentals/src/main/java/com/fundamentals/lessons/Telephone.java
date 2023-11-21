package com.fundamentals.lessons;

/* Abstract Class and abstract methods */
public abstract class Telephone implements PhoneInterface {
    private int volume;
    private int[] numberKeys;
    private int sendKey;
    private String screen;

    public Telephone(int vol, int[] keys, int send, String screen) {
        this.volume = vol;
        this.numberKeys = keys;
        this.sendKey = send;
        this.screen = screen;
    }

    public abstract void receiveCall();

    public abstract void sendCall();

    public int getVolume() { return volume; }
    public int[] getNumberKeys() { return numberKeys; }
    public int getSendKey() { return sendKey; }
    public String getScreen() { return screen; }

    @Override
    public void endCall() {
        System.out.println("The call ends.");
    }
}
