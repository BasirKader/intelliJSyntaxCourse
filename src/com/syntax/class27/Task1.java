package com.syntax.class27;

interface Shape{
    void calculateArea(double input);
    void calculatePerimeter(double input);
}
 class Circle implements Shape{


    @Override
    public void calculateArea(double input) {
        double area=Math.PI*Math.pow(input,2);
    }

    @Override
    public void calculatePerimeter(double input) {
        System.out.println(2*Math.PI*input);
    }
}

class Square implements Shape{

    @Override
    public void calculateArea(double input) {
        double area=input*input;
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter(double input) {

        double perimeter=4*input;
        System.out.println(perimeter);
    }
}
public class Task1 {
    public static void main(String[] args) {
        Square square=new Square();
        square.calculatePerimeter(10);

    }
}
