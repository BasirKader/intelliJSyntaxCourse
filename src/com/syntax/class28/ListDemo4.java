package com.syntax.class28;

import java.util.LinkedList;

public class ListDemo4 {


    public static void main(String[] args) {

        Student  teyfer=new Student("teyfer",20,"memes");
        Student  gulden=new Student("flower pot",21,"study");
        Student  emilia=new Student("emilia",21,"coding");

        LinkedList<Student>studentLinkedList=new LinkedList<>();
        studentLinkedList.add(teyfer);
        studentLinkedList.add(gulden);
        studentLinkedList.add(emilia);
        System.out.println(studentLinkedList);
    }






}
class Student{


    public Student(String name, int age, String hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    String name;
    int age;
    String hobbies;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}