package com.mahendra.app; //Define CURRENT package

//Import classes from other package
import com.mahendra.logic.*;


public class Main {
    public static void main(String[] args) {
        //com.mahendra.logic.Calculator c = new com.mahendra.logic.Calculator();
       /* Calculator c = new Calculator();
        double k = c.doSum(12.02, 55.5);
        System.out.println("Answer "+k);*/

        Dog dog = new Dog();
        System.out.println(dog.getInfo());

    }
}
