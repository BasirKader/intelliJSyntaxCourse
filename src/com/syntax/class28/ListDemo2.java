package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> courses=new LinkedList<>();
        courses.add("sdlc");
        courses.add("manual testing");
        courses.add("java");
        courses.add("git");
        courses.add("selenium");
        courses.add("TestNg");
        courses.add("cucumber");
        courses.add("SQL");
        courses.add("API");
        courses.add("jenkins");
        courses.add("Interview");
        courses.add("resume");
        courses.add("AWS");
        courses.add("Apm");
        courses.add("Docker");
        courses.add("dead");
        //courses.set(courses.size()-1,"happy");//replace
        courses.set(courses.indexOf("dead"),"happy");
        courses.set(4,"happy");
        System.out.println(courses);





    }
}
