package com.mahendra;

import java.io.Serializable;

public class Employee implements Serializable {
	private long empid;
	private String name;
	private String designation;
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(long empid, String name, String designation) {
		super();
		this.empid = empid;
		this.name = name;
		this.designation = designation;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
