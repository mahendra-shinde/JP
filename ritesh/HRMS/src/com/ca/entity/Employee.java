package com.ca.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;


public class Employee implements java.io.Serializable {
    private Integer empId;

    public Employee(Integer empId, String firstName, String lastName, Date joiningDate, String designation) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.joiningDate = joiningDate;
        this.designation = designation;
    }

    private String firstName;
    private String lastName;
    private Date joiningDate;
    private String designation;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", joiningDate=" + joiningDate +
                ", designation='" + designation + '\'' +
                '}';
    }



    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }




}
