package com.syntax.class22;

class Shape {
    double radius;//initializing the field through constructor

    Shape(double radius) {
        this.radius = radius;
    }
}
class Circle extends Shape{
       Circle(double radius){
            super(radius);
        }
       void calculateArea(){
           System.out.println(Math.PI*Math.pow(radius,2));
       }
}



public class Task2 {
    public static void main(String[] args) {
        Circle circle=new Circle(2);
        circle.calculateArea();
    }




}
