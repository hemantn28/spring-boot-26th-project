package com.example.demo.controller;

import com.example.demo.model.Bike;
import com.example.demo.repository.BikeRepository;
import com.example.demo.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BikeDBController {

    @Autowired
    DBService service;
    @RequestMapping(value = "add_bikes_db", method = RequestMethod.POST)
    public String add(@RequestBody Bike bike){

        return service.add(bike);

    }
    //get

    @RequestMapping(value = "get_bikes_db", method = RequestMethod.GET)
    public DBService getService() {
        return getService();
    }
}
