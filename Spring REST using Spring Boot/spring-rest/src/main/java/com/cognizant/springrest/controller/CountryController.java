package com.cognizant.springrest.controller;

import com.cognizant.springrest.model.Country;
import com.cognizant.springrest.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private static final Logger logger = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @GetMapping
    public ResponseEntity<List<Country>> getAllCountries() {
        logger.info("GET /countries - Fetching all countries");
        List<Country> countries = countryService.getAllCountries();
        logger.debug("Total countries found: {}", countries.size());
        return ResponseEntity.ok(countries);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> getCountryById(@PathVariable int id) {
        logger.info("GET /countries/{} - Fetching country by ID", id);
        Country country = countryService.getCountryById(id);
        logger.debug("Country found: {}", country);
        return ResponseEntity.ok(country);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Country> getCountryByName(@PathVariable String name) {
        logger.info("GET /countries/name/{} - Fetching country by name", name);
        Country country = countryService.getCountryByName(name);
        logger.debug("Country found: {}", country);
        return ResponseEntity.ok(country);
    }
}
