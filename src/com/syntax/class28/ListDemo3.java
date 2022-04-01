package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListDemo3 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("sdlc");
        courses.add("manual testing");
        courses.add("java");
        courses.add("git");
        courses.add("selenium");
        System.out.println(courses);

        for (int i = 0; i < courses.size(); i++) {
            if(courses.get(i).equals("java")){
                courses.set(i,"happy");
            }
        }
       /* courses.replaceAll(s->{
            if(s.equals("java")){
                  return"Happy";
              }else{
                  return s;
              }
            });*/


        System.out.println(courses);
    }
}