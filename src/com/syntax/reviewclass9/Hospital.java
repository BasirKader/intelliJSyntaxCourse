package com.syntax.reviewclass9;




public class Hospital {
    public static void main(String[] args) {
        Doctor doc=new Doctor("john","smith","surgeon");

        Doctor doc1=new Doctor("jane","smith");

        System.out.println("changing valur of instance variable");

        doc1.speciality="Dermatologyst";
        doc1.printInfo();

        doc.printInfo();

        System.out.println("changing value of atatic variable");

        //static variable should access in static way-->by class name where variable is defined

        Doctor.hospital="Inova";
        doc.printInfo();
        doc1.printInfo();

        System.out.println("------------------");

        doc1.hospital="Best Hospital";

        doc.printInfo();
        doc1.printInfo();


        /*Variables
        optional                                 must must
        access modifier                       dataType name;
        non access modifier

        Methods
        optional                                  must must
        access modifier
        non access modifier                    returnType name();

         */









    }
}
