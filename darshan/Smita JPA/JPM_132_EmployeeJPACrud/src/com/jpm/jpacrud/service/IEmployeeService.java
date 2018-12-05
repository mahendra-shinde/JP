package com.jpm.jpacrud.service;

import java.util.List;

import com.jpm.jpacrud.entities.Employee;
import com.jpm.jpacrud.exception.EmployeeException;

public interface IEmployeeService {

	// CRUD Operation
	public Long addEmployee(Employee employee)throws EmployeeException;//C-create

	// R All Employee -retrieve
	public List<Employee> getEmployeeList() throws EmployeeException;

	public Employee getEmployeeById(Long empId)throws EmployeeException;//S-search

	public Employee updateEmployee(Employee employee)throws EmployeeException;//U-update

	public Long deleteEmployeeById(Long empId)throws EmployeeException;//D-delete

}
