package com.proje.dao;

import java.util.List;
import com.proje.model.Employee;

public interface EmployeeDAO {

    List<Employee> getAll();

    Employee getById(int id);

    void saveOrUpdate(Employee employee);

    void delete(int id);
}
