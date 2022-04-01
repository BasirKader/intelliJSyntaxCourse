package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {


        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("java");
        arrayList.add("love");
        arrayList.add("lahore");
        arrayList.add("cake");

       // arrayList.removeIf(s -> s.toLowerCase().endsWith("e"));


        Iterator<String>iterator =arrayList.iterator();
        while(iterator.hasNext()){
            if(iterator.next().toLowerCase().endsWith("e")){
                iterator.remove();
            }
        }

        System.out.println(arrayList);



    }
}
