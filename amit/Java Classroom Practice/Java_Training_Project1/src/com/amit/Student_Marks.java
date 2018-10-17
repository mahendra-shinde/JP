package com.amit;

public class Student_Marks {

    private static int passtingMarks = 45;  //class variable
    private int sub1, sub2, sub3;

    public static void set_Passing(int newPassing){
        if (newPassing<50){
            Student_Marks.passtingMarks=newPassing;
        }
        else
            System.out.println("Passing score cannot be 50 or more");

    }



    public  Student_Marks(int sub1, int sub2, int sub3){
        this.sub1=sub1; // instance variable
        this.sub2=sub2;
        this.sub3=sub3;
    }

    public String studentResult(){

        String result = "fail"; // local variable
        if (sub1>=passtingMarks && sub2>=passtingMarks && sub3>=passtingMarks){
            result = "Pass";
        }

        return result;
    }

}
