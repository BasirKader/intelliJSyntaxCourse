package com.syntax.class23;

public class AlisParent {
    String girlName="salma";
    double money=10000000;

    void marry(){
        System.out.println("ali you should marry "+girlName);
    }
}
class Ali extends AlisParent{

    String girlName="Taylor swift";
    void marry(){
        super.marry();
        System.out.println("but Dad i want to marry "+girlName);
    }
}