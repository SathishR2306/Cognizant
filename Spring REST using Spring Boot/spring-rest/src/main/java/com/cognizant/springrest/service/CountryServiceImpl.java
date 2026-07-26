package com.cognizant.springrest.service;

import com.cognizant.springrest.exception.CountryNotFoundException;
import com.cognizant.springrest.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private static final Logger logger = LoggerFactory.getLogger(CountryServiceImpl.class);

    private static final List<Country> countryList = new ArrayList<>();

    static {
        countryList.add(new Country(1,  "India",     "New Delhi"));
        countryList.add(new Country(2,  "USA",       "Washington D.C."));
        countryList.add(new Country(3,  "UK",        "London"));
        countryList.add(new Country(4,  "Australia", "Canberra"));
        countryList.add(new Country(5,  "Japan",     "Tokyo"));
        countryList.add(new Country(6,  "Germany",   "Berlin"));
        countryList.add(new Country(7,  "France",    "Paris"));
        countryList.add(new Country(8,  "Canada",    "Ottawa"));
        countryList.add(new Country(9,  "China",     "Beijing"));
        countryList.add(new Country(10, "Brazil",    "Brasilia"));
    }

    @Override
    public List<Country> getAllCountries() {
        logger.info("CountryServiceImpl.getAllCountries() - Returning {} countries", countryList.size());
        return countryList;
    }

    @Override
    public Country getCountryById(int id) {
        logger.info("CountryServiceImpl.getCountryById() - Searching for ID: {}", id);
        return countryList.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElseThrow(() -> {
                    logger.error("Country not found with ID: {}", id);
                    return new CountryNotFoundException("Country not found with ID: " + id);
                });
    }

    @Override
    public Country getCountryByName(String name) {
        logger.info("CountryServiceImpl.getCountryByName() - Searching for name: {}", name);
        return countryList.stream()
                .filter(c -> c.getCountryName().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> {
                    logger.error("Country not found with name: {}", name);
                    return new CountryNotFoundException("Country not found with name: " + name);
                });
    }
}
