package com.neha;

import java.util.Comparator;

public class CurrentBalanceComparator implements Comparator<Account> {
    public int compare(Account a1, Account a2) {
        return ((int)(a1.getCurrentBalance() - a2.getCurrentBalance()));
    }
}
