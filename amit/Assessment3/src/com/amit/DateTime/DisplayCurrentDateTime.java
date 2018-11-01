package com.amit.DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayCurrentDateTime implements Runnable{

    Date dateobj1 = new Date();
    DateFormat df1 = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        //delay by a sec
        public void delay(){

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.getMessage();

            }

        }

        //Displays date and time for the live thread every second
    @Override
    public void run() {

        while (Thread.currentThread().isAlive()) {




            synchronized (dateobj1){

                System.out.println("Thread Name "+Thread.currentThread().getName()+" prints : "+df1.format(dateobj1));
                delay();
            }




        }


    }
}
