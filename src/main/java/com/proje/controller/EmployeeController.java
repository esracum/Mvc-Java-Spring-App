package com.proje.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proje.model.Employee;
import com.proje.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;
    }

    @GetMapping("/employee")
    public List<Employee> get() {
        return employeeService.get();
    }

    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable int id) {
        return employeeService.get(id);
    }

    @PutMapping("/employee")
    public Employee update(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;
    }

    @DeleteMapping("/employee/{id}")
    public String delete(@PathVariable int id) {
        employeeService.delete(id);
        return "Employee with ID " + id + " has been deleted.";
    }
}
