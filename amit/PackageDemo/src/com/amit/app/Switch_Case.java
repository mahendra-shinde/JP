package com.amit.app;

public class Switch_Case {

    public static void main(String[] args) {

        int mumOfAngles=10;

        switch(mumOfAngles){

            case 3:
                System.out.println("Triangle");
                break;
            case 4:
                System.out.println("Rectangle");
                break;
            case 5:
                System.out.println("Pentagon");
                break;
            default:
                System.out.println("Unknow shape");

        }
    }
}
