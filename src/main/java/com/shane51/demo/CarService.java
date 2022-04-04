package com.shane51.demo;

import com.shane51.demo.domain.Car;
import com.shane51.demo.domain.CarRepository;
import com.shane51.demo.exception.CarNotFoundException;

import java.util.Objects;

public class CarService {
    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car getCarDetails(String name) {
        Car car = carRepository.findByName(name);
        if(Objects.isNull(car)){
            throw new CarNotFoundException();
        }
        return car;
    }
}
