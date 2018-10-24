//Custom Exception class to handle Invalid Credentials

package com.ca.exception;

public class IllegalCredentialsException extends Exception {
    public IllegalCredentialsException() {
        super("Invalid Credentials entered!!");
    }
}
