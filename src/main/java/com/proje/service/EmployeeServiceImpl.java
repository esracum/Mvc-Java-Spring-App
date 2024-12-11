package com.proje.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proje.model.Employee;
import com.proje.repository.Application;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private Application employeeRepository;

    @Override
    public List<Employee> get() {
        return employeeRepository.findAll(); // Tüm çalışanları getir
    }

    @Override
    public Employee get(int id) {
        return employeeRepository.findById(id).orElse(null); // Belirli id'ye sahip çalışanı getir
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee); // Çalışanı ekle ya da güncelle
    }

    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id); // Çalışanı id'ye göre sil
    }
}
