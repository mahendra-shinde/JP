package com.mahendra;

public class Main3 {

    public static void main(String[] args) {
        try {
            int k = 100 / 2;
            int data[] = new int[1];
            data[2]=k;
            System.out.println("Answer: " + k);
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Invalid index "+ex.getMessage());
        }
        finally {
            System.out.println("FINALLY");
        }
        //All exception were handled using CATCH block
        //So JVM Allows execution of next statement!
        System.out.println("End of MAIN");
    }
}
