package com.fundamentals.lessons;

import com.fundamentals.House;

import java.util.*;

/* Collections Framework */
public class Lesson10 {

    /* Array List implements the list interface */
    public void demoArrayList() {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Red");
        myList.add("Blue");
        myList.add("Green");
        myList.add("Yellow");
        myList.add("Orange");

        System.out.println(myList.get(2)); // Green
        System.out.println(myList.contains("re"));
        System.out.println(myList.size()); // 5

        for (String color : myList) {
            System.out.println(color);
        }
    }

    public ArrayList<House> houseList(int count) {
        ArrayList<House> houses = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            houses.add(i, new House());
        }
        return houses;
    }

    /* HashSet implemnents the Set interface */
    public void demoHashSet() {
        HashSet<String> myFireworks = new HashSet<>();
        myFireworks.add("Firecrackers");
        myFireworks.add("Sparklers");
        myFireworks.add("Fountains");
        myFireworks.add("Quarter Stick");
        myFireworks.add("Smoke Bombs");
        myFireworks.add("Mortars");

        Iterator<String> init = myFireworks.iterator();
        while (init.hasNext()) {
            System.out.println(init.next());
        }
        System.out.println();
        for(String fun : myFireworks) {
            System.out.println(fun.hashCode());
        }

    }

    /* Hashmap implements the Map interface*/
    public void demoHashMap() {
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(10, "Happy");
        myMap.put(15, "Days");
        myMap.put(20, "Are here");
        myMap.put(25, "Happy");

        for(Map.Entry<Integer, String> beta : myMap.entrySet()) {
            System.out.println(beta.getKey() + " - " + beta.getValue());
        }
    }

    /* LinkedList implements Queue Interface */
    public void demoLinkedList() {
        LinkedList<String> myPasta = new LinkedList<>();
        myPasta.add("Pasta");
        myPasta.add("Alfredo");
        myPasta.add("Spaghetti");
        myPasta.add("Macaroni");
        myPasta.add("Linguini");
        myPasta.add("Egg Noodle");

        String myPeek = myPasta.peek();
        String myPoll = myPasta.poll();
        System.out.println("This keeps " + myPeek +
                " and this removes " + myPoll);

        for(String food : myPasta) {
            System.out.println(food);
        }
    }

}
