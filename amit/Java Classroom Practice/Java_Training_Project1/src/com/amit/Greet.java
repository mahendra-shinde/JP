package com.amit;

public class Greet {

    public static void main(String[] args) {

        Greet_Class g = new Greet_Class(); //Create an instance of main class

        g.Greet("Amit"); // invoking greet() method

        g.n =100; // n exist as long as g exist
    } //g is destroyed
}
