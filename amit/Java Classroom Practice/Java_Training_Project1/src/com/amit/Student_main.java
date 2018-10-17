package com.amit;

public class Student_main {

    public static void main(String[] args) {

        Student_Marks a = new Student_Marks(38,45,55); //Creatiing object with paramaterized constrctor
        Student_Marks b = new Student_Marks(30,45,55);
        Student_Marks c = new Student_Marks(45,50,60);

        System.out.println(a.studentResult());
        System.out.println(b.studentResult());
        System.out.println(c.studentResult());

        //Student_Marks.passtingMarks = 30;

        Student_Marks.set_Passing(30); //Static Method

        System.out.println(a.studentResult());
        System.out.println(b.studentResult());
        System.out.println(c.studentResult());

        //Student_Marks.passtingMarks = 50;
        Student_Marks.set_Passing(60);

        System.out.println(a.studentResult());
        System.out.println(b.studentResult());
        System.out.println(c.studentResult());

    }

}
