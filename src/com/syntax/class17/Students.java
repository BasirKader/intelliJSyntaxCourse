package com.syntax.class17;

public class Students {

    String name;
    String id;
    static int numberOfStudents;






    public static void main(String[] args) {

        Students student1=new Students();
        student1.name="Yazgul";
        student1.id="123";
        Students.numberOfStudents++;

        Students student2=new Students();
        student2.name="Zuhoor";
        student2.id="456";
        Students.numberOfStudents++;

        Students student3=new Students();
        student3.name="Sayed";
        student3.id="789";
        Students.numberOfStudents++;


    }
}