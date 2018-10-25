package com.mahendra;

public class CharacterPrinter implements Runnable {

    private String statement;

    public CharacterPrinter(String statement) {
        this.statement = statement;
    }

    public void run(){
        for(int i=0;i<statement.length();i++){
            System.out.println(Thread.currentThread().getName());

            System.out.println(" "+statement.charAt(i));
            Thread.yield(); //I have done some of my JOB, let other thread take control now!
        }
    }
}
