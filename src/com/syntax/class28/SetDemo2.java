package com.syntax.class28;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {

        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("mango");
        fruit.add("kiwi");
        fruit.add("apple");
        System.out.println(fruit);

    }
}
