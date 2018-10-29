package com.mahendra;

public class InvalidPrincipalException extends Exception {

    public static final double MIN_AMOUNT = 10000;
    public static final double MAX_AMOUNT = 10000000;

    public InvalidPrincipalException(){
        super("Invalid Principal amount, must be in range "+MIN_AMOUNT+" to "+MAX_AMOUNT);
    }
}
