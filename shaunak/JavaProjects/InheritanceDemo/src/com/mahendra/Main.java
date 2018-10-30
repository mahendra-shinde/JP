package com.mahendra;

public class Main {

    public static void main(String[] args) {
        CompoundInterestCalculator calc =
                new CompoundInterestCalculator(340000,11.2,60);
        double interest = calc.calculate();
        System.out.println("Compound Interest "+interest);
         Main m = new Main();
         m.main();

        InterestCalculator SICalc =
                new InterestCalculator(340000,11.2,60);
        interest = SICalc.calculate();
        System.out.println("Simple Interest "+interest);
    }

    public void main(){

    }
}
