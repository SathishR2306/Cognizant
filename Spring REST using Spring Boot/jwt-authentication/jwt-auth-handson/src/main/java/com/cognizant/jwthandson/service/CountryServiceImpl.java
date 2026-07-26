package com.cognizant.jwthandson.service;

import com.cognizant.jwthandson.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private static final Logger logger = LoggerFactory.getLogger(CountryServiceImpl.class);

    @Override
    public List<Country> getAllCountries() {
        logger.info("CountryServiceImpl.getAllCountries() called");

        List<Country> countries = new ArrayList<>();
        countries.add(new Country("US", "United States"));
        countries.add(new Country("DE", "Germany"));
        countries.add(new Country("IN", "India"));
        countries.add(new Country("JP", "Japan"));

        logger.debug("Returning {} countries", countries.size());
        return countries;
    }
}
