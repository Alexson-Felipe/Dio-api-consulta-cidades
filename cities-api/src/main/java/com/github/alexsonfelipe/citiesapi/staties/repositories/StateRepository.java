package com.github.alexsonfelipe.citiesapi.staties.repositories;

import com.github.alexsonfelipe.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
