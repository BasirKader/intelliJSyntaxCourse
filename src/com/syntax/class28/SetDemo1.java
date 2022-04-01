package com.syntax.class28;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {
       //No duplicates no insertion order
        HashSet<String>fruit=new HashSet<>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("mango");
        fruit.add("kiwi");
        fruit.add("apple");
        System.out.println(fruit);

    }
}
