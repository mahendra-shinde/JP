package com.neha;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class AccountList {
    private LinkedList<Account> accList;

    AccountList(){
        accList = new LinkedList<>();
    }

    public void add(Account a){
        accList.add(a);
    }

    public void displayAll(){
        System.out.println("Displaying all accounts:");
        Iterator it = accList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public void sort(){
        int choice =0;

        do{
            System.out.println("Select option to sort by:");
            System.out.println("1. Account Number");
            System.out.println("2. Account Type");
            System.out.println("3. Account Holder Name");
            System.out.println("4. Branch Name");
            System.out.println("5. Current Balance");
            System.out.println("6. Exit");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch(choice) {
                case 1: {
                    accList.sort(new AccountNoComparator());
                    displayAll();
                    break;
                }
                case 2: {
                    accList.sort(new AccountTypeComparator());
                    displayAll();
                    break;
                }
                case 3: {
                    accList.sort(new AccHolderNameComparator());
                    displayAll();
                    break;
                }
                case 4: {
                    accList.sort(new BranchNameComparator());
                    displayAll();
                    break;
                }
                case 5: {
                    accList.sort(new CurrentBalanceComparator());
                    displayAll();
                    break;
                }
                case 6: {
                    break;
                }
                default: {
                    System.out.println("Please select correct option");
                }
            }
        }while(choice!=6);
    }
}
