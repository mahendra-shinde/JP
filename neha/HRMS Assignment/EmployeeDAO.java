package com.neha;

import java.util.List;

public interface EmployeeDAO {
    public void addEmployee(Employee e);
    public Employee findbyID(int empID);
    public List<Employee> findbyName(String name);
    public void listAllEmployees();
    public void load();
    public void unload();

}
