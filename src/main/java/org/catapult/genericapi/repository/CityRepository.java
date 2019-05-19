package org.catapult.genericapi.repository;

import org.catapult.genericapi.model.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Long> {
	
}
