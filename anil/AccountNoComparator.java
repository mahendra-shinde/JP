package com.neha;

import java.util.Comparator;

public class AccountNoComparator implements Comparator<Account> {
    @Override
    public int compare(Account a1, Account a2) {
        return a1.getAccountNo() - a2.getAccountNo();
    }
}
