package com.ca.dao;

import com.ca.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    void add(Employee book);
    Employee findById(int empId);
    List<Employee> findByFirstName(String firstName);
    List<Employee> getEmployeesList();
}
