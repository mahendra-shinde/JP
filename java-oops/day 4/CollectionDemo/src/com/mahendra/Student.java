package com.mahendra;

public class Student implements  Comparable {
    private int rollNo;
    private String firstName;
    private String lastName;
    private int age;

    public Student(int rollNo, String firstName, String lastName, int age){
        this.rollNo= rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString(){
        return rollNo+", Name: "+firstName+" "+lastName+" age: "+age;
    }

    public int compareTo(Object obj){
        System.out.println("Using compareTo");
        if(!(obj instanceof  Student)){
            return -1;
        }
        else
        {
            Student otherStudent = (Student) obj;
            return this.rollNo  - otherStudent.rollNo;
        }
    }
}
