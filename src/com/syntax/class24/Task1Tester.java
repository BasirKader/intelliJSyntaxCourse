package com.syntax.class24;

public class Task1Tester {
    public static void main(String[] args) {
        //in Java we can store the object of a child classes in a parent type variable
        //Every class in Java can be treated as a datatype
        Student syntaxStudent=new SyntaxStudent();
        Student schoolStudent=new SchoolStudent();
        /*as we can store the object of a child class in a parent class
        we can also create an array of these students as shown below*/

        Student[] students={new SyntaxStudent(),new SchoolStudent(),new CollegeStudent()};

       /* int[]arr={1,2,3};
        for (int number:arr
             ) {
            System.out.println(number);
        }*/
        //students[0].practice();
        for (Student student:students
             ) {
            student.study();
            student.doHomeWork();
        }
    }
}
