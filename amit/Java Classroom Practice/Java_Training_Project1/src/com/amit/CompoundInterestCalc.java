package com.amit;

public class CompoundInterestCalc extends interestCalc{

    public CompoundInterestCalc(double principal, double rate, double duration){

        super (principal, rate, duration);

    }

    //method overiding example, same name, parameter, type and retrun value
    @Override
    protected double calculate(){

        return interest = principal*Math.pow((1+rate/100),duration/12) ;
        //System.out.println("Compound Interest is : "+interest);
    }

}
