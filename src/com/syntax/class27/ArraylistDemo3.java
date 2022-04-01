package com.syntax.class27;

import java.util.ArrayList;

public class ArraylistDemo3 {
    public static void main(String[] args) {
        ArrayList<Boolean> flags=new ArrayList<>();
        flags.add(true);
        flags.add(true);
        flags.add(false);
        flags.add(true);
        System.out.println(flags.contains(false));


    }
}
