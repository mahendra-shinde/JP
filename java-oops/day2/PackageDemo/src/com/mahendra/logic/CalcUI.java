package com.mahendra.logic;

public class CalcUI {
    public static void main(String[] args) {
        // c is ref variable
        //'new' instruct JVM to build new object of type 'Calculator' class
        //then store its reference in variable 'c'
        Calculator c = new Calculator();
        // Another variable
        Calculator d = c; //c and d both referring same Object
        c.doSum(12.9,99.1);
        c = null;
        d = null;
    }
}
