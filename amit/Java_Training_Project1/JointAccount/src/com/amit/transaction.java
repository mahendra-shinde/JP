package com.amit;

public class transaction implements Runnable{


    double damount;
    Merchant mer;

    transaction(double damount, Merchant mer){
        this.damount=damount;
        this.mer = mer;

    }

    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        System.out.println(tName+" is Performing withdraw");

        mer.debit(damount);

        mer.displayAvBal();

    }
}
