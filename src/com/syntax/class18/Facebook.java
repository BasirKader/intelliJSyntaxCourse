package com.syntax.class18;

public class Facebook {
    private String  userName;
    private String passWord;
    private int age;

    void setAge(int personAge){
        if(personAge>13 && personAge<120){
            age=personAge;
        }else{
            System.out.println("not allowed its not a horse");
        }
    }



}
