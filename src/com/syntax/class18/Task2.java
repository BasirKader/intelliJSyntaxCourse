package com.syntax.class18;

public class Task2 {
    //Create a method that will take a string
    //as a parameter and returns reversed string
    //method should be available ti all classes within
    //your project.

   public static String reverseString(String input){
   // StringBuilder stringBuilder=new StringBuilder(input);
    //stringBuilder.reverse();
   return new StringBuilder(input).reverse().toString();

}

    public static void main(String[] args) {
        String name="emilia";
        System.out.println(Task2.reverseString(name));
    }




}
