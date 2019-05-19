package org.catapult.genericapi.controller;

import java.util.List;

import org.catapult.genericapi.model.City;
import org.catapult.genericapi.model.User;
import org.catapult.genericapi.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	@Autowired
    private GenericService service;

    @RequestMapping(value ="/cities")
    public List<City> getUser(){
        return service.findAllRandomCities();
    }

    @RequestMapping(value ="/users", method = RequestMethod.GET)
    public List<User> getUsers(){
        return service.findAllUsers();
    }
}
	