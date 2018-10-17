package com.amit;

public class Airplane_Class_interface_imple implements Flyable {

    @Override
    public void fly() {
        System.out.println("airplane fly");
        Flyable.navigate();
    }


    public static void main(String[] args) {
        Airplane_Class_interface_imple fl = new Airplane_Class_interface_imple();
        fl.fly(); //class function
        fl.fly1();  // interface default function

        Flyable.navigate();
    }



}
