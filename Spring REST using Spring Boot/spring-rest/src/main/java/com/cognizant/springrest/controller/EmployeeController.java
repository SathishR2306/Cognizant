package com.cognizant.springrest.controller;

import com.cognizant.springrest.model.Employee;
import com.cognizant.springrest.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        logger.info("GET /employees - Fetching all employees");
        List<Employee> employees = employeeService.getAllEmployees();
        logger.debug("Total employees: {}", employees.size());
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
        logger.info("GET /employees/{} - Fetching employee by ID", id);
        Employee employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        logger.info("POST /employees - Adding new employee: {}", employee.getName());
        Employee created = employeeService.addEmployee(employee);
        logger.info("Employee created with ID: {}", created.getId());
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id,
                                                    @RequestBody Employee employee) {
        logger.info("PUT /employees/{} - Updating employee", id);
        Employee updated = employeeService.updateEmployee(id, employee);
        logger.info("Employee updated: {}", updated);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
        logger.info("DELETE /employees/{} - Deleting employee", id);
        employeeService.deleteEmployee(id);
        logger.info("Employee with ID {} deleted", id);
        return ResponseEntity.ok("Employee with ID " + id + " deleted successfully.");
    }
}
