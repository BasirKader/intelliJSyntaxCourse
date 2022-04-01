package com.syntax.reviewclass8;

public class StringClass3 {

    public static void main(String[] args) {

        String batch="batch 12";
        String course="SDET";

        String company="            Syntax      Tech";

        System.out.println(company.trim());

        String name="nasir gopi krishankastabai ramakriskan";

        System.out.println(name.replaceAll(" "," "));


        if ("batch 12".equals(batch) &&"SDET".equals(course)){
            System.out.println("you will get link to lecture");
        }else{
            System.out.println("watch my youtube channel");
        }

        if("Batch 12".equalsIgnoreCase(batch)&&"SDET".equalsIgnoreCase(course)){
            System.out.println("now all types of inputs are accepted");
        }


    }
}
