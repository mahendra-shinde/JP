/**
 * 
 */
package com.jpm.jpacrud.service;

import java.util.List;

import com.jpm.jpacrud.dao.EmployeeDao;
import com.jpm.jpacrud.dao.IEmployeeDao;
import com.jpm.jpacrud.entities.Employee;
import com.jpm.jpacrud.exception.EmployeeException;

/**
 * @author Administrator
 *
 */
public class EmployeeService implements IEmployeeService {
	// prepwork - create object o IEmployeeDao

	private IEmployeeDao employeeDao;

	public EmployeeService() {
		employeeDao = new EmployeeDao();
	}

	@Override
	public Long addEmployee(Employee employee) throws EmployeeException {
		// Call dao layer method and return to Client
		employeeDao.beginTransaction();
		employeeDao.addEmployee(employee);
		employeeDao.commitTransaction();
		// auto generated emp id will be returned
		return employee.getEmployeeId();
	}

	@Override
	public List<Employee> getEmployeeList() throws EmployeeException {
		// call Dao layer method and return to Service layer
		return employeeDao.getEmployeeList();
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		employeeDao.beginTransaction();
		employeeDao.updateEmployee(employee);
		employeeDao.commitTransaction();
		return employee;
	}

	@Override
	public Employee getEmployeeById(Long empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(empId);
	}

	@Override
	public Long deleteEmployeeById(Long empId) throws EmployeeException {
		// Call dao layer method and return to Client
		employeeDao.beginTransaction();
		employeeDao.deleteEmployeeById(empId);
		employeeDao.commitTransaction();
		// auto generated emp id will be returned
		return empId;
	}
	
	

}
