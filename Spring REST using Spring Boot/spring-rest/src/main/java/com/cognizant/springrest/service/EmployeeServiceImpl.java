package com.cognizant.springrest.service;

import com.cognizant.springrest.exception.EmployeeNotFoundException;
import com.cognizant.springrest.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    private static final AtomicInteger idCounter = new AtomicInteger(3);

    private static final List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee(1, "Alice Johnson", "Engineering", 75000.00));
        employeeList.add(new Employee(2, "Bob Smith",     "Marketing",   55000.00));
        employeeList.add(new Employee(3, "Charlie Brown", "HR",          48000.00));
    }

    @Override
    public List<Employee> getAllEmployees() {
        logger.info("EmployeeServiceImpl.getAllEmployees() - Returning {} employees", employeeList.size());
        return employeeList;
    }

    @Override
    public Employee getEmployeeById(int id) {
        logger.info("EmployeeServiceImpl.getEmployeeById() - Searching for ID: {}", id);
        return employeeList.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElseThrow(() -> {
                    logger.error("Employee not found with ID: {}", id);
                    return new EmployeeNotFoundException("Employee not found with ID: " + id);
                });
    }

    @Override
    public Employee addEmployee(Employee employee) {
        int newId = idCounter.incrementAndGet();
        employee.setId(newId);
        employeeList.add(employee);
        logger.info("EmployeeServiceImpl.addEmployee() - Added employee with ID: {}", newId);
        return employee;
    }

    @Override
    public Employee updateEmployee(int id, Employee updatedEmployee) {
        logger.info("EmployeeServiceImpl.updateEmployee() - Updating employee with ID: {}", id);
        Employee existing = getEmployeeById(id);
        existing.setName(updatedEmployee.getName());
        existing.setDepartment(updatedEmployee.getDepartment());
        existing.setSalary(updatedEmployee.getSalary());
        logger.info("Employee updated successfully: {}", existing);
        return existing;
    }

    @Override
    public void deleteEmployee(int id) {
        logger.info("EmployeeServiceImpl.deleteEmployee() - Deleting employee with ID: {}", id);
        Employee employee = getEmployeeById(id);
        employeeList.remove(employee);
        logger.info("Employee with ID {} deleted successfully", id);
    }
}
