package com.amit;

public class Merchant_Main {

    public static void main(String[] args) {

        customer c1 = new customer("Amit",5000,"HF234235345");
        Merchant m1  = new Merchant(c1, "HF234235345","MSEB");
        Merchant m2  = new Merchant(c1, "HF234235345","Airtel");
        Thread t1 = new Thread(new transaction(4100,m1));
        Thread t2 = new Thread(new transaction(4500,m2));

        t1.start();
        t2.start();

        try {

            t1.join();
            t2.join();

        }catch (InterruptedException ex){

            ex.printStackTrace();
        }






    }
}
