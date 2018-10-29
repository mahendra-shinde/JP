package com.neha;

import java.util.Comparator;

public class AccountTypeComparator implements Comparator<Account> {
    @Override
    public int compare(Account a1, Account a2) {
        return a1.getAccountType().compareTo(a2.getAccountType());
    }
}