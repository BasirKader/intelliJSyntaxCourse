package com.syntax.class19;

public class Horse {
    //it is a very good practice to make the fields private
    private String name;
    private int age;
    private double weight;


    //purpose of constructor is to give initial values to the fields of a class
    Horse(String horseName,int horseAge,double horseWeight){
        name=horseName;
        age=horseAge;
        weight=horseWeight;

    }

    public Horse(String jacky, int horseAge, int horseWeight) {
    }

    void printHorseName(){
        System.out.println("name " + name);
    }

    void setName(String horseName){
        name=horseName;
    }





}
