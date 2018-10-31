package com.mahendra;

public class InterestCalculator {
    protected double principal;
    protected double rate;
    protected int duration;

    public InterestCalculator(double principal, double rate, int duration){
        this.principal = principal;
        this.duration = duration;
        this.rate = rate;
    }

    public InterestCalculator(double principal, double rate){
        this.principal = principal;
        this.rate = rate;
        this.duration = 36;
    }

    public double calculate(){
        return principal*rate/100/12*duration;
    }
}
