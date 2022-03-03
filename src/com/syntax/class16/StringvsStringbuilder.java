package com.syntax.class16;

public class StringvsStringbuilder {
    public static void main(String[] args) {
        String s = "asghar is great";
        //System.out.println(s.concat("hahha"));
        s.concat("hahha");
             System.out.println(s);

        StringBuilder stringBuilder = new StringBuilder("Asghar is great");

        stringBuilder.append("hahha");
        //System.out.println(stringBuilder.append("hahha"));
        System.out.println(stringBuilder);



    }
}