package com.fundamentals.lessons;

import com.fundamentals.Condo;
import com.fundamentals.House;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* Lambda Expressions */
public class Lesson16 {

    public void noLambda() {
        SomeInterface some = new SomeInterface() {
            @Override
            public void someRealMethod() {
                System.out.println("My no lambda");
            }
        };
        some.someRealMethod();
    }

    public void withLambda() {
        SomeInterface myLambda = () -> {
          System.out.println("My lambda something");
        };
        myLambda.someRealMethod();
    }

    public void multipleLambda() {
        // using parameter declaration
        SimpleAdditionInterface simple1 = (able, bravo) -> (able + bravo);
        System.out.println(simple1.add(12, 87));

        SimpleAdditionInterface simple2 = (int charlie, int delta) -> (charlie + delta);
        System.out.println(simple2.add(34, 764));
    }

    public void listLambda () {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");

        list.forEach((num) -> System.out.println(num));
    }

    public void filterLambda() {
        ArrayList<House> houses = getHouseList();
        Stream<House> filterHouses =
                houses.stream().filter(myHouses ->
                        myHouses.getDoorColor().equals("Red"));
        filterHouses.forEach(house -> System.out.println("Selections " +
                house.toString()));
    }
    public static ArrayList<CompanyInfo> getInfo() {
        ArrayList<CompanyInfo> infoList = new ArrayList<>();
        infoList.add(new CompanyInfo(1000, "John"));
        infoList.add(new CompanyInfo(1100, "Jane"));
        infoList.add(new CompanyInfo(1200, "Debra"));
        infoList.add(new CompanyInfo(2000, "Paul"));
        infoList.add(new CompanyInfo(2100, "Mike"));
        infoList.add(new CompanyInfo(2200, "Amy"));
        infoList.add(new CompanyInfo(1300, "Kate"));

        return infoList;
    }

    public void queryInfo(ArrayList<CompanyInfo> company,
                          Predicate<CompanyInfo> expr) {
        ArrayList<CompanyInfo> results = new ArrayList<>();
        for(CompanyInfo info : company) {
            if(expr.test(info)) {
                results.add(info);
            }
        }
        results.forEach(person -> System.out.println(person));
    }

    private ArrayList<House> getHouseList() {
        ArrayList<House> houseList = new ArrayList<House>();
        houseList.add(new House());
        houseList.add(new House("Concrete", "Shingle"));
        houseList.add(new House("Wood", "Cedar", "Red", 32));
        houseList.add(new House("Dirt", "Mud"));
        houseList.add(new House("Logs", "Logs", "Green", 43));
        houseList.add(new House());
        houseList.add(new House("Cinder Block", "Composite"));
        houseList.add(new House());
        return houseList;
    }


}
