package com.syntax.reviewclass8;



public class Class1 {


    public void printSmallerDigit(int x, int y ) {
        if (x < y) {
            System.out.println("X is smaller one");
        } else if (y < x) {
            System.out.println("y is the smaller one");
        } else {
            System.out.println("both the values are same");
        }
    }
        public static void main (String[]args){
            Class1 obj=new Class1();
            obj.printSmallerDigit(3,5);
            obj.printSmallerDigit(5,8);



    }
}
