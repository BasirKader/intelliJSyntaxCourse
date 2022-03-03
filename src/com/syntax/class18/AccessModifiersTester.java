package com.syntax.class18;

public class AccessModifiersTester {

    public static void main(String[] args) {
         AccessModifiers am=new AccessModifiers();
   //Cant access as name has private access
       // System.out.println(am.name);
                System.out.println(am.age);
        //cant access age because it has default access
                System.out.println(am.weight);
        //cant access weight because it has private access
                System.out.println(am.color);
        //can only access color because it has public access
        //which can be accessed from anywhere inside the same project





    }
}
