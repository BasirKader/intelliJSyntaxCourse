package com.syntax.class24;

abstract class File {
    abstract void open();
    void edit(){
        System.out.println("Editing a class");
    }
    void close(){
        System.out.println("closing the file");
    }
}
class JavaFile extends File{
    @Override
    void open(){
        System.out.println("the intellij to open java files");
    }
}
class WordFile extends File{
    @Override
    void open(){
        System.out.println("use microsoft word to open this file");
    }
}
class PDFFile extends File{
    @Override
    void open(){
        System.out.println("use adobe reader to open the file");
    }
}




public class Task2{
    public static void main(String[] args) {

        //if a method is not present inside the parent class we cant call that method
        //using polymorphism

        File[] files={new JavaFile(),new WordFile(),new PDFFile()};
        for (int i = 0; i < files.length; i++) {
            files[i].open();
            files[i].edit();
            files[i].close();
        }
        /*int i =0;
        while(i < file.length){
            file[i].open();
            file[i].edit();
            file[i].close();
            i++;*/
        }


}