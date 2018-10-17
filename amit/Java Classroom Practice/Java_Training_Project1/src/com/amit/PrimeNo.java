package com.amit;

public class PrimeNo {

    public static void main(String arg[]){

        //Program to check if the entered number is prime
        int num=232;
        boolean isPrime = true;

        for (int i=2; i<num/2; i++){

            if (num%i==0){

                isPrime  = false;

                System.out.println(num +" is divisible by "+i);
                break;
            }
        }

        if(isPrime)
        {
            System.out.println(num+ " is a prime");
        }
        else
        {
            System.out.println(num +" is not a prime");
        }


    }
}
