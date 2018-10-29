package com.shaunak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String name = null;
        try{
            System.out.println("Enter Your Name: ");
            // Buffered Manually
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(reader);
            name = br.readLine();

            System.err.println("Hello " + name);
            br.close();
        }catch (IOException ex){
            System.out.println("Unable to Read");
        }
    }
}
