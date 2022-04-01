package com.syntax.class27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo6 {
    public static void main(String[] args) {

        List<String> groceries=Arrays.asList("apple","orange","banana");
        /*groceries.add("Apples");
        groceries.add("Orange");
        groceries.add("Banana");
        groceries.add("Potato");
        groceries.add("Onion");
        groceries.add("Carrot");*/
        System.out.println(groceries);

        ArrayList<String> list2=new ArrayList<>();

        list2.add("Apple");
        list2.add("Onion");

        System.out.println(groceries.containsAll(list2));
    }
}
