package com.shaunak;

import java.io.Serializable;

public class Employee implements Serializable {
	private Integer EmployeeId;
//	private String title;
	private String FirstName;
//	private String author;
	private String LastName;
	private String dept;
//	private Float price;
	private Float salary;

	public Integer getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(Integer EmployeeId) {
		this.EmployeeId = EmployeeId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void getFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	public String getdept() {
		return dept;
	}
	public void setdept(String dept) {
		this.LastName = dept;
	}
	public Float getsalary() {
		return salary;
	}
	public void setsalary(Float price) {
		this.salary = salary;
	}
	public Employee(Integer EmployeeId, String FirstName, String LastName,String department, Float salary) {
		this.EmployeeId = EmployeeId;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", FirstName=" + FirstName + "]";
	}
	
	
}
