package com.mahendra;

public class InterestCalculator {
    static void calc(double p, double r, int d) throws Exception {
      if(p<InvalidPrincipalException.MIN_AMOUNT || p>InvalidPrincipalException.MAX_AMOUNT)
          throw new InvalidPrincipalException();

      if(r<4 || r > 25)
          throw new Exception("Rate of Interest must be in range 4 to 25");

      if(d<12 || d>240)
          throw new Exception("Duration must be in range 12 to 240 months");

      double interest = p*r/100/12*d;
        System.out.println("Interest : "+interest);
    }
}
