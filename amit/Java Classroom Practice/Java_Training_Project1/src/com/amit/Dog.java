package com.amit;

public class Dog {

    String breed;
    String size;
    String color;
    int age;

    //cpnstruction
    public Dog(){

        breed="india";
        size="small";
        age=1;
        color="black";

    }

        //parametirized constructor
    public Dog(String breed, String size, int age){

        //use 'this' to distinguish instance variable from local variables
        this.breed=breed;
        this.size=size;
        this.age=age;

    }

    public String dogMethod(){

        return ("\nBreed is "+breed+ "\nSize is "+size+ "\nColor is "+color+ "\nage is "+age);
    }
}
