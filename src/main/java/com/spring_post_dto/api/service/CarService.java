package com.spring_post_dto.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_post_dto.api.DTO.CarDTO;
import com.spring_post_dto.api.model.Car;
import com.spring_post_dto.api.repository.CarRepository;

@Service
public class CarService {

    @Autowired
    private CarRepository repository;

    public List<Car> findAll() {
        return repository.findAll();
    }

    public void save(CarDTO req) {
        repository.save(new Car(req));
    }
    
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void update(Long id, CarDTO req) {
        repository.findById(id).map(car -> {
            car.setAnoModlo(req.anoModlo());
            car.setDataFabricacao(req.dataFabricacao());
            car.setFabricante(req.fabricante());
            car.setModelo(req.modelo());
            car.setValor(req.valor());

            return repository.save(car);
        });
    }
    
}
