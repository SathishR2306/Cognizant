package com.cognizant.springrest.service;

import com.cognizant.springrest.model.Country;

import java.util.List;

public interface CountryService {

    List<Country> getAllCountries();

    Country getCountryById(int id);

    Country getCountryByName(String name);
}
