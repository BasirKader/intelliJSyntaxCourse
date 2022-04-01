package com.syntax.class19;

public class SeriousHorseTester {
    public static void main(String[] args) {
        Horse horse=new Horse("jacky",20,400);
        horse.setName("jacky");


        //horse --->data type(names of classes)
        //horse --->Objects/instance/reference variable/variable
        //= ->assignment operator
        //horse ("jacky",20,400)-->call to a constructor

        horse.printHorseName();

    }
}
