package com.syntax.reviewclass7;

import java.util.Locale;

public class Practice5 {

    String weekDay(String day){
        day=day.toLowerCase();
        switch(day){
            case"monday":
                return"It is a lazy day";
            case"tuesday":
                return"It is a productive day";
            case"wednesday":
                return"It is a gloomy day";
            case"thursday":
                return"It is a exciting day";
            case"friday":
                return"It is a work day";
            case"saturday":
                return"It is a lazy day";
            case"sunday":
                return"It is a lazy day";
            default:
                return"no correct option found";

        }
    }

    public static void main(String[] args) {
        Practice5 obj=new Practice5();
        String output=obj.weekDay("friday");

        System.out.println(output);



    }





}

