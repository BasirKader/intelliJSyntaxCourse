package com.syntax.class26;

import java.util.ArrayList;

public class CollectionDemo2 {
    public static void main(String[] args) {

        ArrayList<String> countries=new ArrayList<>();

        countries.add("USA");
        countries.add("Turkey");
        countries.add("Iraq");
        countries.add("Gana");
        countries.add("Eritrea");
        countries.add("Afghanistan");

        System.out.println(countries.get(3));
      //  System.out.println(countries.get(-1));
       // System.out.println(countries.get(7)); out of bound
        System.out.println(countries);
        System.out.println(countries.size());
        countries.add(3,"pakistan");//insert the elements at this specified index
        System.out.println(countries);
        System.out.println(countries.size());
        countries.remove("Pakistan");
        countries.add("PAKISTAN");
        countries.clear();
        System.out.println(countries);



    }
}
