package com.syntax.class28;

import java.util.ArrayList;

public class ListDemo1 {
    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList();
        arrayList.add(10);
        arrayList.add("name");
        arrayList.add(12.5);
        arrayList.add(true);

        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i)instanceof String){

            }else{
                System.out.println("conversion not possible");
            }
            System.out.println(((String) arrayList.get(i)).length());
        }

        System.out.println(arrayList);





    }
}
