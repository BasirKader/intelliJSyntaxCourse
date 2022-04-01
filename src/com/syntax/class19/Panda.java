package com.syntax.class19;

public class Panda {
    String name;
    String breed;
    String color;
    double height;
    int age;
    double weight;

    Panda(){

    }


    Panda(String pandaName,String pandaBreed,String pandaColor
            ,double pandaHeight,int pandaAge,double pandaWeight){
        name=pandaName;
        breed=pandaBreed;
        color=pandaColor;
        height=pandaHeight;
        age=pandaAge;
        weight=pandaWeight;
    }

    Panda(String pandaName){
        name=pandaName;
    }

    void printInfo(){
        System.out.println(name+ " "+ breed + " "+ color+" " +
                height+ ""+ age+ " " + weight

        );
    }

}

