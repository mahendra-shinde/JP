package com.mahendra;

public class CompoundInterestCalculator extends InterestCalculator {

    //Constructor Chaining....
    public CompoundInterestCalculator
        (double principal, double rate, int duration){
        //Call to Super() must be FIRST statement
       super(principal,rate,duration);
    }

    public CompoundInterestCalculator
            (double principal, double rate){
        //Call to Super() must be FIRST statement
        super(principal,rate);
    }

    //Overridden method
    //Exact SAME method signature found in BASE/SUPER class
    @Override
    public double calculate(){
            return principal*Math.pow((1+rate/100),duration/12);
    }


}
