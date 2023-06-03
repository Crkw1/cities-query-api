package com.example.citiesqueryapi.cities.reposiroty;

import com.example.citiesqueryapi.cities.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
