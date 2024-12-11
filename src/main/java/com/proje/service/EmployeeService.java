package com.proje.service;

import java.util.List;

import com.proje.model.Employee;

public interface EmployeeService {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
