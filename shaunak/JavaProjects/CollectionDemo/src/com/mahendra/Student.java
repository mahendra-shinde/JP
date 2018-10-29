package com.mahendra;

//Allow Comparing Student with Student only
public class Student implements  Comparable<Student> {
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

    public int compareTo(Student obj){
        System.out.println("Using compareTo");
        return this.rollNo  - obj.rollNo;

    }
}
