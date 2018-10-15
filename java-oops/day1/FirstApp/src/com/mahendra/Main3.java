package com.mahendra;

public class Main3 {
    public static void main(String[] args) {

        Greet g = new Greet();  //Creating instance of "Greet" class
        g.greet("Mahendra");    //Invoking greet() method

        g.n = 100;  // n exists as long as "g" exists!!!
    } // "g" is destroyed!!!!
}
