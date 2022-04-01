package com.syntax.class27;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo7 {
    public static void main(String[] args) {

        ArrayList<Integer>arrayList=new ArrayList<>();

        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(1,100);

        LinkedList<Integer> numbers=new LinkedList<>();
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(1,100);
    }
}
