package net.employee.springboot_backend.controller;

import net.employee.springboot_backend.model.Employee;
import net.employee.springboot_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    //build Create Employee REST API
    @PostMapping
    public Employee createEmployee( @RequestBody Employee employee) { //converts json body to java object -RequestBody
        return employeeRepository.save(employee);
    }
}
