package com.neha;

import java.util.Comparator;

public class AccHolderNameComparator implements Comparator<Account> {
    @Override
    public int compare(Account a1, Account a2) {
        return a1.getAccountHolderName().compareTo(a2.getAccountHolderName());
    }
}