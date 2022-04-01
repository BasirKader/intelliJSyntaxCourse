package com.syntax.class24;

public abstract class Phone {

    void makePhoneCall(){
        System.out.println("Making a phone call");
    }
    void sendText(){
        System.out.println("Sending a text");
    }
    abstract void displayPicture();
    abstract void unlockPhone();
}
class Iphone extends Phone{

    @Override
    void displayPicture() {
        System.out.println("Use photo app to display pics");
    }
    @Override
    void unlockPhone(){
        System.out.println("use face ID unlock to open this phone");
    }

}
class Samsung extends Phone{
    @Override
    void displayPicture(){
        System.out.println("Use gallery to display pictures");
    }
    @Override
    void unlockPhone(){
        System.out.println("can use face unlock and in display finger to unlock");
    }
}