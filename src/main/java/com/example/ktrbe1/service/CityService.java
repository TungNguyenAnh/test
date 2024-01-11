package com.example.ktrbe1.service;

import com.example.ktrbe1.model.City;
import com.example.ktrbe1.repository.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CityService implements ICityService {
    @Autowired
    ICityRepository iCityRepository;

    @Override
    public Iterable<City> findAll() {
        return iCityRepository.findAll();
    }

    @Override
    public Optional<City> findById(Long id) {
        return iCityRepository.findById(id);
    }


    @Override
    public void save(City city) {
        iCityRepository.save(city);
    }

    @Override
    public void remove(Long id) {
        iCityRepository.deleteById(id);
    }

    @Override
    public void edit(City city, Long id){
        city.setId(id);
        iCityRepository.save(city);
    }
}
