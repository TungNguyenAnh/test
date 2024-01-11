package com.example.ktrbe1.service;

import com.example.ktrbe1.model.City;
import com.example.ktrbe1.model.City;

import java.util.Optional;

public interface ICityService {
    Iterable<City> findAll();

    Optional<City> findById(Long id);

    void save(City city);

    void remove(Long id);

    void edit(City city, Long id);
}
