package com.shaunak;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Account> bankAcc = new ArrayList<Account>();
        bankAcc.add(new Account(201,"Savings","Shaunak","Kandivali",25000));
        bankAcc.add(new Account(401,"Current","Viral","Borivali",50000));
        bankAcc.add(new Account(301,"Savings","Chndra","Palava",75000));

        System.out.println("Raw Data");
        for (int i = 0; i<bankAcc.size();i++ )
        {
            System.out.println(bankAcc.get(i));
        }

        System.out.println("After Sorting");
        Collections.sort(bankAcc, new sortbyAccNumber());
        System.out.println("After Sorting by Account Number");
        for(int i=0; i<bankAcc.size(); i++)
        {
            System.out.println(bankAcc.get(i));
        }

        Collections.sort(bankAcc, new sortbyAccName());
        System.out.println("After Sorting by Account Name");
        for(int i=0; i<bankAcc.size(); i++)
        {
            System.out.println(bankAcc.get(i));
        }
    }
}
