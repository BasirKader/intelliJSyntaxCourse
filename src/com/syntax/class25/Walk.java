package com.syntax.class25;

interface Healthable{
    void healthy();

}

public interface Walk extends Healthable {

    void burnCalories();
}
interface Milk extends Healthable{

    void giveEnergy();
}
interface Banana extends Healthable{

    void giveEnergy();
}

class Demo implements Banana{

    @Override
    public void healthy(){
        System.out.println("Banana is good for health");
    }
    @Override
    public void giveEnergy(){
        System.out.println("i gives us energy");
    }
}