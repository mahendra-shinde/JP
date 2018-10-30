package com.shaunak;

public class NoSufficientFundException extends RuntimeException {
    public NoSufficientFundException(int accountNo) {
    super("No Sufficient fund in Account "+accountNo );
    }

}
