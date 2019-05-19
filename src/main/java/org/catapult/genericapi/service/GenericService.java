package org.catapult.genericapi.service;

import java.util.List;

import org.catapult.genericapi.model.City;
import org.catapult.genericapi.model.User;


public interface GenericService {
	User findByUsername(String username);

    List<User> findAllUsers();

    List<City> findAllRandomCities();
}
