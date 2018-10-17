package com.amit;

public class Main {

    public static void main(String[] args) {
	// write your code here

        byte bytevar = 16;

        int intvar = bytevar;

        float floatvar = intvar;

        long longvar = intvar;

        floatvar = longvar;

        double doublevar = floatvar;

        char charvalue = '\u0041';

        intvar = charvalue;

        System.out.println(intvar);

        System.out.println(charvalue);

        int n =22/7; // loss of precision

        System.out.println(n);

        float m =22/7; // loss of precision

        System.out.println(m);

        float o =(float)22 /7; // no loss of precision

        System.out.println(o);

        double p =22/(double)7; // no loss of precision

        System.out.println(p);

      int  k=10;
        System.out.println(++k);

        int  k1=10;
        System.out.println(k1++);

    }

}
