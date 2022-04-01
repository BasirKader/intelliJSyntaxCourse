package com.syntax.reviewclass9_anotherpackage;

import com.syntax.reviewclass9.Doctor;

public class Hospital2 {
    public static void main(String[] args) {

        Doctor doc= new Doctor("volcan", "Dereli");
        doc.printInfo();//public available everywhere
        Doctor.work();//protected method not available in different package
        //doc.hello();//default method not available in different package
        //doc.getPaid();//private method is not available in different classes

    }
}
