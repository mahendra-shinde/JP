package com.amit;

public interface Flyable {

    int speed = 100;   //Public and final and Static

    void fly();  //Abstract and public

    default void fly1(){
        System.out.println("default fly");
    };

    //interface can have static method
    public static  void navigate(){

        System.out.println("static method");

    }

}
