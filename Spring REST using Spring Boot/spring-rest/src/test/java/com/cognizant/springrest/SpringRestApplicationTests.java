package com.cognizant.springrest;

import com.cognizant.springrest.model.Country;
import com.cognizant.springrest.model.Employee;
import com.cognizant.springrest.service.CountryService;
import com.cognizant.springrest.service.EmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringRestApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(SpringRestApplicationTests.class);

    @Autowired
    private CountryService countryService;

    @Autowired
    private EmployeeService employeeService;

    @Test
    void contextLoads() {
        logger.info("TEST: contextLoads - Spring application context loaded successfully");
        Assertions.assertNotNull(countryService, "CountryService should not be null");
        Assertions.assertNotNull(employeeService, "EmployeeService should not be null");
    }

    @Test
    void testGetAllCountries() {
        logger.info("TEST: testGetAllCountries");
        List<Country> countries = countryService.getAllCountries();
        Assertions.assertNotNull(countries);
        Assertions.assertFalse(countries.isEmpty(), "Country list should not be empty");
        logger.info("Countries found: {}", countries.size());
    }

    @Test
    void testGetCountryById() {
        logger.info("TEST: testGetCountryById");
        Country country = countryService.getCountryById(1);
        Assertions.assertNotNull(country);
        Assertions.assertEquals(1, country.getId());
        Assertions.assertEquals("India", country.getCountryName());
        logger.info("Country retrieved: {}", country);
    }

    @Test
    void testGetCountryByName() {
        logger.info("TEST: testGetCountryByName");
        Country country = countryService.getCountryByName("USA");
        Assertions.assertNotNull(country);
        Assertions.assertEquals("USA", country.getCountryName());
        Assertions.assertEquals("Washington D.C.", country.getCapital());
        logger.info("Country retrieved: {}", country);
    }

    @Test
    void testGetAllEmployees() {
        logger.info("TEST: testGetAllEmployees");
        List<Employee> employees = employeeService.getAllEmployees();
        Assertions.assertNotNull(employees);
        Assertions.assertFalse(employees.isEmpty(), "Employee list should not be empty");
        logger.info("Employees found: {}", employees.size());
    }

    @Test
    void testGetEmployeeById() {
        logger.info("TEST: testGetEmployeeById");
        Employee employee = employeeService.getEmployeeById(1);
        Assertions.assertNotNull(employee);
        Assertions.assertEquals(1, employee.getId());
        Assertions.assertEquals("Alice Johnson", employee.getName());
        logger.info("Employee retrieved: {}", employee);
    }

    @Test
    void testAddEmployee() {
        logger.info("TEST: testAddEmployee");
        Employee newEmp = new Employee(0, "David White", "Finance", 62000.00);
        Employee created = employeeService.addEmployee(newEmp);
        Assertions.assertNotNull(created);
        Assertions.assertTrue(created.getId() > 0, "New employee should have an auto-generated ID");
        logger.info("New employee created: {}", created);
    }
}
