package com.shaunak;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CharacterPrinter printer = new CharacterPrinter("The quick Brown Fox jumnps over the lazy dog");
        CharacterPrinter printer2 = new CharacterPrinter("12345678901011121314");

        Thread t1 = new Thread(printer);
        Thread t2 = new Thread(printer2);

        t1.start();
        t2.start();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        try{
            System.out.println("Hey JVM, Let Others finish First");
            t1.join();
            t2.join();

        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("\nEnd of Main");


    }
}
