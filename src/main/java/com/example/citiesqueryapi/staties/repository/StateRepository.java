package com.example.citiesqueryapi.staties.repository;

import com.example.citiesqueryapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
