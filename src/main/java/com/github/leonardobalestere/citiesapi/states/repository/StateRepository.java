package com.github.leonardobalestere.citiesapi.states.repository;

import com.github.leonardobalestere.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State,Long> {
}
