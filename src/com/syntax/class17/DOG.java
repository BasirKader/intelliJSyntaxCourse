package com.syntax.class17;

class HealthyDog {

    String name;//instance
    String color;//instance
    static int numberOfLegs;//static

    void eat(){
        int noOfTimes=3;//local
        System.out.println(name + "eats" + noOfTimes);
    }

    void sleep(){
        System.out.println(name+" Sleeping");
    }

    public static void main(String[] args) {

        HealthyDog dog=new HealthyDog();

        dog.name="scooby";
        dog.color="pink";
        HealthyDog.numberOfLegs=6;
        dog.eat();

        HealthyDog dog2=new HealthyDog();

        dog2.name="";
        dog2.color="navi blue";
        HealthyDog.numberOfLegs=4;
        dog2.eat();





    }

}
