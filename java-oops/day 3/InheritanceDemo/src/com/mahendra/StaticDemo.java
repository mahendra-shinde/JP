package com.mahendra;

class Animal{

    static int getX(){
        return 1;
    }
}

class Dog extends Animal{
    static int getX(){
        return 10;
    }
}

public class StaticDemo {

    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.getX());
    }
}
