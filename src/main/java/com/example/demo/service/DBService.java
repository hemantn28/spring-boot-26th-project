package com.example.demo.service;

import com.example.demo.model.Bike;
import com.example.demo.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class DBService {

    @Autowired
    BikeRepository repository;
    public String add( Bike bike){
        repository.save(bike);
        return "bike added to DB successfully";

    }

    public BikeRepository getRepository() {
        return repository;
    }
}
