package com.syntax.reviewclass7;

public class ObjectAndClassPractice {

    String empName;
    int empId;
    String group;

    void employeeDetails(){
        System.out.println("This method shows the details of the employee");

    }

    void employeeGroup(){
        System.out.println("This method shows the group of the employee");

    }

    public static void main(String[] args) {

        ObjectAndClassPractice obj=new ObjectAndClassPractice();
        obj.employeeGroup();
        obj.employeeDetails();

    }

}
