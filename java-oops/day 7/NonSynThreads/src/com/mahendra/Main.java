package com.swati;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(1029009,12000);
        Customer him = new Customer(account, "Barak");
        Customer her = new Customer(account,"micheal");
        Thread t1 = new Thread(new Transaction(him,10000));
        Thread t2 = new Thread(new Transaction(her, 7500));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch(InterruptedException ex) {}

        System.out.println("Final balance is "+account.getBalance());
    }
}
