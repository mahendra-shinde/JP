package com.amit;

public class Merchant {

    customer cust;
    String cActNo;
    //double damount;
    String merchantName;

    Merchant(customer cust, String cActNo, String merchantName){

        this.cust=cust;
        this.cActNo=cActNo;
        this.merchantName=merchantName;
    }

    public void debit(double damount){

        delay();
        synchronized (cust){
            double temp = cust.getBalance() - damount;
            if (cust.getBalance()>1000){
                cust.setBalance(temp);
                System.out.println("Amount "+damount+" deducted by merchant "+merchantName);
            delay();
            }else{
                System.out.println("Transaction Denied : Insuffiecient Balance");
            }
        }

    }

    public void displayAvBal(){

        System.out.println("Current Available balance : "+cust.getBalance());
    }



    void delay(){
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){

            System.out.println(e.getMessage());
        }

    }
}
