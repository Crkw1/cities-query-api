package com.example.citiesqueryapi.countries.repository;

import com.example.citiesqueryapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long>{
}
