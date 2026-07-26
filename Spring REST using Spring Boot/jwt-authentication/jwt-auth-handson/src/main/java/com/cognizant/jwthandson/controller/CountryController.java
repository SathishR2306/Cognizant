package com.cognizant.jwthandson.controller;

import com.cognizant.jwthandson.model.Country;
import com.cognizant.jwthandson.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    private static final Logger logger = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public ResponseEntity<List<Country>> getAllCountries() {
        logger.info("GET /countries - Fetching all countries (JWT protected endpoint)");
        List<Country> countries = countryService.getAllCountries();
        logger.debug("Returning {} countries", countries.size());
        return ResponseEntity.ok(countries);
    }
}
