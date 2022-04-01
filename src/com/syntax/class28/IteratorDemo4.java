package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo4 {
    public static void main(String[] args) {
        List<String> courses=new LinkedList<>();
        courses.add("sdlc");
        courses.add("manual testing");
        courses.add("java");
        courses.add("java");
        courses.add("selenium");

        Iterator<String> iterator=courses.iterator();
        System.out.println(courses);

        while (iterator.hasNext()){
            if(iterator.next().equals("java")){
                iterator.remove();
            }
        }
//when you are doing any operations on the lists that can change its size use
        //Iterator otherwise you can use loops

    }
}
