package com.syntax.class18;

public class Facebook {
    private String  userName;
    private String passWord;
    private int age;

    void setAge(int personAge){
        if(personAge>12 && personAge<100){
            age=personAge;
        }else{
            System.out.println("not allowed its not a horse");
        }
    }
    int getAge(String userPassword){
        if(userPassword.equals(userPassword)){
            return age;
        }else{
            return -1;
        }
    }


}
