package com.spring_post_dto.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_post_dto.api.model.Car;

public interface CarRepository extends JpaRepository<Car,Long> {
    
}
