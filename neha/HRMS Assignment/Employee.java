package com.neha;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private int empID;
    private String name;
    private Date doj;
    private String desg;
    private double salary;
    private int contactNo;
    private String email;

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", doj=" + doj +
                ", desg='" + desg + '\'' +
                '}';
    }

    public Employee(int empID, String name, Date doj,String desg, double salary, int contactNo, String email) {
        this.empID = empID;
        this.name = name;
        this.doj = doj;
        this.desg = desg;
        this.salary = salary;
        this.contactNo = contactNo;
        this.email = email;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public String getDesg() {
        return desg;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


