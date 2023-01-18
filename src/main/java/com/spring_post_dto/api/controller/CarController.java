package com.spring_post_dto.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_post_dto.api.DTO.CarDTO;

@RestController
@RequestMapping("/")
public class CarController {

    @PostMapping
    public void creatCar(@RequestBody CarDTO req) {
        System.out.println(req.modelo());
    }
    
}
