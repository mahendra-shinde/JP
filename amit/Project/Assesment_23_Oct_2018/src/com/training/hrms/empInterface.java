package com.training.hrms;

import java.util.List;

public interface empInterface {

    void add(Employee employee);
    Employee findById(int bookId);
    List<Employee> findByfirstName(String firstName);
}
