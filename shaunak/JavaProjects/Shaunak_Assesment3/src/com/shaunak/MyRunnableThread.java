package com.shaunak;

import java.text.SimpleDateFormat;
import java.util.Date;

//This class is made as a thread by implementing "Runnable" interface
public class MyRunnableThread implements Runnable{

private String myThread;
    //This method will be executed when this thread is executed
    public void run() {
        while (true){

            try {
                //Displaying the Date in dd/MM/yyyy pattern
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                System.out.println("Current date and time : " + formatter.format(date));
                // Let the thread sleep for a while.
                /*taking a delay of one second before displaying next date and time
                 *
                 * "Thread.sleep(1000);" - when this statement is executed,
                 * this thread will sleep for 1000 milliseconds (1 second)
                 * before executing the next statement.
                 */
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("Thread " + myThread + " interrupted.");
                /*Interrupted exception will be thrown when a sleeping or waiting
                 thread is interrupted.
                 */
            }
        }

    }
}
