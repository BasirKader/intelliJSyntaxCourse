package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;

public class IteratorDemo1 {
    public static void main(String[] args) {

        List<String> courses=new LinkedList<>();
        courses.add("sdlc");
        courses.add("manual testing");
        courses.add("java");
        courses.add("java");
        courses.add("selenium");

        for (int i = 0; i < 5; i++) {
            if(courses.get(i).equals("java")){
                courses.remove("java");
            }
        }
        for (String course:courses
        ){
            if(course.equals("java")) {

                courses.remove(course);
            }

        }

    }
}
