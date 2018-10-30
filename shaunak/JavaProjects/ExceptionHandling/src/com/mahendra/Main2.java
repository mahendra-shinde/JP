package com.mahendra;

public class Main2 {

    public static void main(String[] args) {
        try {
            int k = 100 / 2;
            int data[] = new int[1];
            data[2]=k;
            System.out.println("Answer: " + k);
        }catch(RuntimeException ex){ //Can handle both exception
            System.out.println(ex.getMessage());
        }
        //All exception were handled using CATCH block
        //So JVM Allows execution of next statement!
        System.out.println("End of MAIN");
    }
}
