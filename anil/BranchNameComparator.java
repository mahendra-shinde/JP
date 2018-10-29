package com.neha;

import java.util.Comparator;

public class BranchNameComparator implements Comparator<Account> {
    @Override
    public int compare(Account a1, Account a2) {
        return a1.getBranchName().compareTo(a2.getBranchName());
    }
}