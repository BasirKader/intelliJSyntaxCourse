package com.syntax.class16;

public class Task2 {
    public static void main(String[] args) {

        String s="12344##%%^&&%$#^AZSFCDF123";
        System.out.println(s.length());

        System.out.println(s.replaceAll("[^A-Za-z0-9]","").length());






    }
}
