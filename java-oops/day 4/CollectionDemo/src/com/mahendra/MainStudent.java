package com.mahendra;

import java.util.*;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList();
        students.add(new Student(103,"John","Snow",15));

        students.add(new Student(101,"Tony","Jaa",12));

        students.add(new Student(104,"Will","Smith",11));
        students.add(new Student(102,"Charles","Chaplin",14));

        Collections.sort(students);
        System.out.println("After sorting...");

        for(Student obj : students){
            System.out.println(obj);
        }
    }
}
