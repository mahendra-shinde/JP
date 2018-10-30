package com.mahendra.app;

import com.mahendra.logic.Account;

public class ObjectDemo {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = a1;

        System.out.println("Hashcode for a1: "+a1.hashCode());

        System.out.println("Hashcode for a2: "+a2.hashCode());

        System.out.println("Hashcode for a3: "+a3.hashCode());
    }
}
