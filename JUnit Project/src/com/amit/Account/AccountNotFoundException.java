package com.amit.Account;

public class AccountNotFoundException extends  RuntimeException{

    AccountNotFoundException(){

        super("Account not found - Exception");
    }
}
