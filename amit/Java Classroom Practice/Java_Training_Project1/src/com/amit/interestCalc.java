package com.amit;

public class interestCalc {

    protected  double principal;
    protected  double rate;
    protected double duration;
    protected double interest;

    public interestCalc(double principal, double rate, double duration ){


        this.rate=rate;
        this.principal= principal;
        this.duration=duration;

    }

    protected double calculate(){

      return  interest = (principal*rate*duration)/100;
        //System.out.println("Simple Interest is : "+interest);
    }
}
