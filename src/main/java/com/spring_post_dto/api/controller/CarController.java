package com.spring_post_dto.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_post_dto.api.DTO.CarDTO;
import com.spring_post_dto.api.model.Car;
import com.spring_post_dto.api.service.CarService;

@RestController
@RequestMapping("/")
public class CarController {

    @Autowired
    private CarService service;

    @GetMapping
    public List<Car> listAll() {
        return service.findAll();
    }

    @PostMapping
    public void creatCar(@RequestBody CarDTO req) {
        service.save(req);
    }
    
    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
        service.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updateCar(@PathVariable Long id, @RequestBody CarDTO req) {
        service.update(id, req);
    }
}
