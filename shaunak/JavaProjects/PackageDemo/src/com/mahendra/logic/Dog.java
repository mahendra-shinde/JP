package com.mahendra.logic;

public class Dog {
    private String breed;
    private String size;
    private int age;

    //No-Arg constructor [Uses Same name as Classname]
    public Dog(){
        breed="indian";
        size="small";
        age=1;
    }

    //Parameterized constructor
    public Dog(String breed, String size, int age){
        //Use 'this' to distinguish instance variable from local variables
        this.breed = breed;
        this.size= size;
        this.age= age;
    }

    public String getInfo(){
        return "Breed: "+this.breed+", size: "+size+", age: "+age+" years";
    }
}
