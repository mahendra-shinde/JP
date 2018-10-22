package com.mahendra;

import java.time.LocalDate;

public class Employee  implements  java.io.Serializable{
    private String firstName, lastName;
    private int age;
    private LocalDate joiningDate;

    public Employee(String firstName, String lastName, int age, LocalDate joiningDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", joiningDate=" + joiningDate +
                '}';
    }
}
