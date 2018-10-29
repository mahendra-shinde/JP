package com.shaunak;

public class CharacterPrinter implements Runnable {

    private String statement;

    public CharacterPrinter(String statement) {
        this.statement = statement;
    }

    public void run(){
        for(int i=0;i<statement.length();i++){
            System.out.print(" "+statement.charAt(i));

            Thread.yield(); //I have done my Job, let other thread take control now
            //System.out.println(Thread.activeCount());
           // System.out.println(Thread.currentThread().getName());
          try {
              Thread.sleep(1000);
          }catch (InterruptedException ex){
              ex.getStackTrace();
          }
        }
    }
}
