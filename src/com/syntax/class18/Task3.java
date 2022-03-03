package com.syntax.class18;

public class Task3 {

    private static String onlyVowels(String input){
     // String newStr=input.replaceAll("aeiouAEIOU"," ");
      return input.replaceAll("[^aeiouAEIOU]"," ");
    }

    public static void main(String[] args) {
        System.out.println(onlyVowels("emilia"));
    }
}
