package com.mahendra;

public class Main {

    public static void main(String[] args) {
        //Define TASK
        CharacterPrinter printer = new CharacterPrinter("The quick brown fox jumps over the lazy dog.");
        CharacterPrinter printer2 = new CharacterPrinter("123456789101112131415");

        //Create a WORKER thread and ASSIGN TASK to it
        Thread t1 = new Thread(printer);
        Thread t2 = new Thread(printer2);

        // Launch the Thread
        t1.start();
        t2.start();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        try {
            System.out.println("hey JVM, Let others finish first!");
            t1.join();
            t2.join();
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("End of Main");
    }
}
