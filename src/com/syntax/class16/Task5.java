package com.syntax.class16;

public class Task5 {
    public static void main(String[] args) {

        Task5 task= new Task5();
        System.out.println(task.isPalindrome("aba"));
        System.out.println(task.isPalindrome("abbc"));
    }

        boolean isPalindrome(String inputStr){
            String reversedStr=reverseString(inputStr);
            return reversedStr.equals(inputStr);

        }
        String reverseString (String inputString){
            StringBuilder stringBuilder = new StringBuilder(inputString);
            stringBuilder.reverse();
            return stringBuilder.toString();
        }


    }

