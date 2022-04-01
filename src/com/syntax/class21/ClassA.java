package com.syntax.class21;

public class ClassA {
   void method(){
       System.out.println("A");
   }
}
class ClassB extends ClassA{
    void method(){
        System.out.println("B");
    }
    void test(){
        method();//calls the same class method
        this.method();//calls the same class method
        super.method();//calls the parent class method
    }
}
class Tester{
    public static void main(String[] args) {
        ClassB classB=new ClassB();
        classB.test();
    }
}
