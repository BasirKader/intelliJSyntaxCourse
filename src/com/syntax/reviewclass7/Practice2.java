package com.syntax.reviewclass7;

public class Practice2 {

    String getRecord(){
        String department="QA";
        String empName="violet";
        String details="worker" + empName + "belongs to" + department;
        return details;



    }

    public static void main(String[] args) {
        Practice2 p=new Practice2();
        p.getRecord();
    }





}
