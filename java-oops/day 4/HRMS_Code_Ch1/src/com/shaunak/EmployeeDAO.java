package com.shaunak;

import java.util.List;

public interface EmployeeDAO {
	void add(Employee employee);
	Employee findById(int employeeId);
	List<Employee> findByEmployeeFname(String author);
}
