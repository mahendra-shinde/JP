package com.amit.app;

import com.amit.logic.Calculator;
public class CalcApp {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        double k = c.doSum(55.50,12.20);

        System.out.println(k);


    }
}
