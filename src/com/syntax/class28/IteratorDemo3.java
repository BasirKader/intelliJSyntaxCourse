package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo3 {
    public static void main(String[] args) {

        List<String>courses=new LinkedList<>();
        courses.add("sdlc");
        courses.add("manual testing");
        courses.add("java");
        courses.add("java");
        courses.add("selenium");

        Iterator<String> iterator=courses.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
