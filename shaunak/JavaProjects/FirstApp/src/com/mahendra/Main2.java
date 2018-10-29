package com.mahendra;

public class Main2 {

    public static void main(String args[]){
        System.out.println("1st line in MAIN");
        drawLine(); //Method Invocation
        System.out.println("\n2nd line in MAIN");
        drawLine(45); // "width:" is added by intelij ITS NOT PART OF JAVA CODE
    }

    static void drawLine(){
        for(int i=0;i<100;i++){
            System.out.print("-");
        }
    }

    static void drawLine(int width){
        for(int i=0;i<width;i++){
            System.out.print("-");
        }
    }

}
