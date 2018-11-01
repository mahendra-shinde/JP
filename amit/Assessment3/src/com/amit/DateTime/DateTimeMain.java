package com.amit.DateTime;

public class DateTimeMain {

    public static void main(String[] args) {
	// write your code here

        DisplayCurrentDateTime dt = new DisplayCurrentDateTime();

        Thread t1 = new Thread(new DisplayCurrentDateTime());
        Thread t2 = new Thread(new DisplayCurrentDateTime());

        t1.start();
        t2.start();

        try {

            t1.join();
            t1.join();

        }catch (InterruptedException e){
            e.getMessage();
        }

    }
}
