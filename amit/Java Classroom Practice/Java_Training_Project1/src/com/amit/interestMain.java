package com.amit;

public class interestMain {

    public static void main(String[] args) {

     //   interestCalc si = new interestCalc();

       //         si.calculate();

        CompoundInterestCalc ci = new CompoundInterestCalc(340000, 11.2,60);
        System.out.println(ci.calculate());

    }
}
