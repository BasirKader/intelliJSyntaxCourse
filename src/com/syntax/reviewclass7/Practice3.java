package com.syntax.reviewclass7;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class Practice3 {

    String studentName;
    String course;
    int studentId;
    int grades;

    void displaysStudentRecord(){
        System.out.println("The student name is " + studentName);
        System.out.println("The course student enrolled for is " + course);
        System.out.println("the student ID is " + studentId);
        System.out.println("The grades student achieved are " + grades);
    }

    public static void main(String[] args) {

        Practice3 obj=new Practice3();

        obj.studentName="Rogo";
        obj.course="SDET";
        obj.studentId=123;
        obj.grades=75;

        obj.displaysStudentRecord();


        Practice3 obj1=new Practice3();

        obj1.studentName="Yazina";
        obj1.course="science";
        obj1.studentId=345;
        obj1.grades=89;

        obj1.displaysStudentRecord();

    }

}
