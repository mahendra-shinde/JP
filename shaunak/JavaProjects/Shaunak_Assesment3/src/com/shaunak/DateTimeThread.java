package com.shaunak;

public class DateTimeThread {
    public static void main(String a[]){
        //Creating an object of the thread
        MyRunnableThread mrt = new MyRunnableThread();
        Thread tr = new Thread(mrt);
        tr.start();
            }
        }
