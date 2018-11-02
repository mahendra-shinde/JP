package com.amit.app;

public class ForLoop {

    public static void main(String[] args) {

        int num[] = {22,33,55,77,88};

        for (int i=0; i<num.length;i++){

            System.out.println(num[i]);
        }

        for(int j:num){
            System.out.println("num "+j);
        }

    }
}
