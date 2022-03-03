package com.syntax.class16;

public class Task4 {
    public static void main(String[] args) {
        String s = "Sunday is great";
        Task4 task4 = new Task4();
        //System.out.println(task4.reverseString(s));
        String[] strArray = s.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(task4.reverseString(strArray[i]) + " ");
        }

    }
        String reverseString (String inputString){
            StringBuilder stringBuilder = new StringBuilder(inputString);
            stringBuilder.reverse();
            return stringBuilder.toString();
        }
    }


