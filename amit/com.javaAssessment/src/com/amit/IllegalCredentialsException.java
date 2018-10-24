package com.amit;

public class IllegalCredentialsException extends Exception{

    public static  final Integer MIN_UserName = 6;
    public static  final Integer MAX_UserName = 12;
    IllegalCredentialsException(){

        super("IllegalCredentialException : Issue withe Userid/Password entered");
    }
}
