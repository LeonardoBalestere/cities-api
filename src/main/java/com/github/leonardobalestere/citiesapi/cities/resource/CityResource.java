package com.github.leonardobalestere.citiesapi.cities.resource;


import com.github.leonardobalestere.citiesapi.cities.entities.City;
import com.github.leonardobalestere.citiesapi.cities.repository.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cities")
public class CityResource {

    private final CityRepository repository;

    public CityResource(final CityRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<City> cities(Pageable page) { return repository.findAll(page);   }
}