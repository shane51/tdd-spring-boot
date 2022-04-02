package com.shane51.demo;

import com.shane51.demo.domain.Car;

public class CarService {
    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car getCarDetails(String name) {
        return carRepository.findByName(name);
    }
}
