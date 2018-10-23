package com.training.hrms;

import java.io.Serializable;

public class Employee implements java.io.Serializable {

    private Integer EmpId;
    private String DeptId;
    private String FirstName;
    private String LastName;
    private Double Salary;

    Employee(Integer EmpId, String DeptId,String FirstName, String LastName,Double Salary){

        this.EmpId = EmpId;
        this.DeptId = DeptId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Salary = Salary;



    }

    public Integer getEmpId() {
        return EmpId;
    }

    public void setEmpId(Integer EmpId) {
        this.EmpId = EmpId;
    }

    public String getDeptId() {
        return DeptId;
    }

    public void setDeptId(String DeptId) {
        this.DeptId = DeptId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;

    }
    public String getLastName() {
        return LastName;
    }

    public void setLastName (String LastName){
        this.LastName = LastName;

    }

    public Double getSalary() {
        return Salary;
    }
    public void setSalary(Double Salary) {
        this.Salary = Salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "EmpId=" + EmpId +
                ", DeptId='" + DeptId + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
