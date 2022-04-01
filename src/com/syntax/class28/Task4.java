package com.syntax.class28;


import java.util.ArrayList;
import java.util.Iterator;

/*Create an arrayList of even numbers from 1 to 50.
       Remove any number that is divisible by 5 from that arrayList.
       */
public class Task4 {
    public static void main(String[] args) {

        ArrayList<Integer> number=new ArrayList<>();

        for (int i = 2; i <500 ; i+=2) {
            number.add(i);
        }
        number.removeIf(integer->integer%5==0);

        Iterator<Integer>iterator=number.iterator();
        while(iterator.hasNext()){
    if(iterator.next()%5==0){
        iterator.remove();
    }
        }




    }
}
