package org.catapult.genericapi.service.impl;

import java.util.List;

import org.catapult.genericapi.model.City;
import org.catapult.genericapi.model.User;
import org.catapult.genericapi.repository.CityRepository;
import org.catapult.genericapi.repository.UserRepository;
import org.catapult.genericapi.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenericServiceImpl implements GenericService {

	@Autowired
    private UserRepository userRepository;

    @Autowired
    private CityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>)userRepository.findAll();
    }

    @Override
    public List<City> findAllRandomCities() {
        return (List<City>)randomCityRepository.findAll();
    }

}
