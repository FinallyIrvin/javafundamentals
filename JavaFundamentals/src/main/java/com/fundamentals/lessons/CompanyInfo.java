package com.fundamentals.lessons;
/*Constructors and Encapsulation */
public class CompanyInfo {

    static String company = "Your Company";


    public int id;
    public String name;

    public CompanyInfo() {
        this(0, "Unknown Name");
    }

    public CompanyInfo(int id, String name) {
        this.id = id;
    this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
