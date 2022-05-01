package com.example.demo.controller;


import com.example.demo.model.Bike;
import com.example.demo.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DBController {

    //Create
    @Autowired
    BikeRepository repository;
    @RequestMapping(value = "add_bike_db", method = RequestMethod.POST)
    public String add(@RequestBody Bike bike){
        repository.save(bike);
        return "bike added to DB successfully";

    }


    //Get

    @RequestMapping(value = "get_bike_db", method = RequestMethod.GET)
    public List<Bike> getAll(){
        return repository.findAll();

    }

    //Update

    @RequestMapping(value = "update_bike_db/{price}/{name}/{model}/{id}",method = RequestMethod.PUT)
    public String update(@PathVariable int price,@PathVariable String name,@PathVariable String model,@PathVariable Integer id){
        Bike bike=repository.getById(id);
        bike.setPrice(95000);
        bike.setName("Bajaj");
        bike.setModel("Discover");
        repository.save(bike);
        return "bike updated in Db successfully";


    }


    //Delete

    @RequestMapping(value = "bike_deleted_db/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id){
        repository.deleteById(id);
        return "bike deleted in Db successfully";

    }

}
