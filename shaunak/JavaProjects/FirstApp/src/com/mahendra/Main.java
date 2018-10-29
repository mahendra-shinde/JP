package com.mahendra;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte byteVar = 16;
        //Example of Widening / Implicit conversion
        int intVar = byteVar;

        float floatVar = intVar;

        long longVar = intVar;

        floatVar = longVar;

        double doubleVar = floatVar;

        char charVal = '\u0041';
        intVar = charVal;

        System.out.println("Char in INT:"+ intVar);

        int n = 22/7; //Loss of Precison
        System.out.println("n = "+n);

        float f = (float)22 /7; // NO Loss of precision ???
        System.out.println("f = "+f);

        double d = 22/7.0;
        System.out.println("d = "+d);


    }
}
