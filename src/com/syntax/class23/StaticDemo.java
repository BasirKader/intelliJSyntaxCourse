package com.syntax.class23;

public class StaticDemo {
    String name;
    int number;

}
class Cat{
    static int NoOfLegs=4;
    String name;

    Cat(String name){
        this.name=name;
    }

    public void printInfo(){
        System.out.println(name+NoOfLegs);
    }
    public static void Print(){
        //we can't access the instance fields directly inside static methods
       // System.out.println(name+NoOfLegs);
        //we cant use instance fields with static methods
        System.out.println();
    }

    public static void main(String[] args) {
        Cat cat=new Cat("Stella");

        Cat.Print();
        Cat cat2=new Cat("Nutella");
        Cat.Print();
    }
}