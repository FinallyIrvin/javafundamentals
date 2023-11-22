package com.fundamentals.labs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionsLab {

//Task 1
    public void taskOne() {
        System.out.println("Task 1");

        ArrayList<String> taskOneList = new ArrayList<>();
        taskOneList.add("Cacio e Pepe Pizza");
        taskOneList.add("Roasted Chicken and Leek Pizza");
        taskOneList.add("Pizza with Charred Cherry Tomatoes and Pesto");
        taskOneList.add("Portobello Mushroom and Red Pepper Pizza");
        taskOneList.add("Eggplant, Pesto, and Goat Cheese Pizza");
        taskOneList.add("Fennel and Sweet Onion Pizza with Green Olives");
        taskOneList.add("Spring Onion and Salami Sheet-Pan Pizza");
        taskOneList.add("Mushroom and Goat Cheese Béchamel Pizzas");
        taskOneList.add("Scallop and Bacon Pizza");
        taskOneList.add("Roman Pizza");
        for (String pizzaTopping : taskOneList) {
            System.out.println(pizzaTopping);
        }
    }

// Task 2
    public HashSet<Integer> taskTwo(int count) {
        System.out.println();
        System.out.println("Task 2");

        HashSet<Integer> taskTwoList = new HashSet<>();
        for(int i = 0; i <= count; i++){
            if(i % 5 ==0){
                taskTwoList.add(i);
            }
        }
        return taskTwoList;
    }

// Task 3
    public void taskThree() {
        System.out.println();
        System.out.println("Task 3");

        HashMap<String, String> myBooks = new HashMap<>();
        myBooks.put("9780439023528", "The Hunger Games");
        myBooks.put("9781423117100","The Lighting Thief");
        myBooks.put("9780812036381","Hamlet");
        myBooks.put("1338878921", "Harry Potter and the Sorcerer's Stone");

        for(Map.Entry<String,String> books : myBooks.entrySet()) {
            System.out.println(books.getKey() + " = " + books.getValue());
        }

    }



    public static void main(String[] args) {
        CollectionsLab myCollectionsLab = new CollectionsLab();
        myCollectionsLab.taskOne();
        HashSet<Integer> myList = myCollectionsLab.taskTwo(50);
        for(int num: myList){
            System.out.println(num);
        }
        myCollectionsLab.taskThree();
    }
}
