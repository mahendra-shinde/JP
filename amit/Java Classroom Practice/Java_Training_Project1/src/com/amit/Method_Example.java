package com.amit;

public class Method_Example {

    public static void main(String[] args) {

        System.out.println("1st line in main");
        drawLine(); //method invocation
        System.out.println("\n2nd line in main");
        drawLine(45);

    }



        static void drawLine(){

            for(int i=0; i<100;i++){
                System.out.print("-");
            }
        }

        static void drawLine(int width){

            for(int i=0; i<width;i++){
                System.out.print("-");
            }
        }


    }


