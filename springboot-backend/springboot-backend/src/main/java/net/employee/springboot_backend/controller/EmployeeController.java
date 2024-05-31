package net.employee.springboot_backend.controller;

import net.employee.springboot_backend.exception.ResourceNotFoundException;
import net.employee.springboot_backend.model.Employee;
import net.employee.springboot_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    //build get Employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById (@PathVariable  long id) {
        Employee employee = employeeRepository.findById(id). orElseThrow(()-> new ResourceNotFoundException("Employee not exists with id: "+ id));
        return ResponseEntity.ok(employee);
    }

    //build Update Employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employeeDetails) {
        Employee updateEmployee = employeeRepository.findById(id).
                orElseThrow(()-> new ResourceNotFoundException(" No Employee found for id: " +id));

        updateEmployee.setFirstName(employeeDetails.getFirstName());
        updateEmployee.setLastName(employeeDetails.getLastName());
        updateEmployee.setEmailId(employeeDetails.getEmailId());

        employeeRepository.save(updateEmployee);
        return ResponseEntity.ok(updateEmployee);
    }

    //build Delete Employee REST API
        @DeleteMapping("{id}")
        public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id) {

            Employee employee = employeeRepository.findById(id).
                    orElseThrow(()-> new ResourceNotFoundException(" No Employee found for id: " +id));

            employeeRepository.delete(employee);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        }

    }

