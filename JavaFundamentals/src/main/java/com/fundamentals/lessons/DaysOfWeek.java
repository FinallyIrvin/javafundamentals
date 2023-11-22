package com.fundamentals.lessons;

public enum DaysOfWeek {
    SUN(2,"Sunday"), MON(4,"Monday"),
    TUE(6,"Tuesday"), WED(8,"Wednesday"),
    THU(10, "Thursday"), FRI(12,"Friday"), SAT(14,"Saturday");

    private final int dayNumber;
    private final String day;

    private DaysOfWeek(int num, String day) {
        this.dayNumber = num;
        this.day = day;
        //System.out.println("Constructor call for " + this);
    }

    public int getDayNumber() { return dayNumber;}

    public String getDay() { return day;}

    public void someEnumMethod() {
        System.out.println("Method inside an Enum");
    }

}
