package com.spring_post_dto.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_post_dto.api.DTO.CarDTO;
import com.spring_post_dto.api.model.Car;
import com.spring_post_dto.api.repository.CarRepository;

@RestController
@RequestMapping("/")
public class CarController {

    @Autowired
    private CarRepository repository;

    @GetMapping
    public List<Car> listAll() {
        return repository.findAll();
    }

    @PostMapping
    public void creatCar(@RequestBody CarDTO req) {
        repository.save(new Car(req));
    }
    
}
