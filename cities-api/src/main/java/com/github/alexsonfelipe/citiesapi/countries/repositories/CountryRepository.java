package com.github.alexsonfelipe.citiesapi.countries.repositories;

import com.github.alexsonfelipe.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
