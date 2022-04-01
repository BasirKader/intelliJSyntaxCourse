package com.syntax.class28;

import java.util.ArrayList;

           /*Create an arraylist of drinks.
           if any drink has letter "a" or "e" replace it with water
            */


public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Tea");
        drinks.add("coffee");
        drinks.add("aloevera");
        drinks.add("milk");

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                  drinks.set(i,"water");
            }
        }


    }
}
