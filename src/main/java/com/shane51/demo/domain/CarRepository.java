package com.shane51.demo.domain;

import com.shane51.demo.domain.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car,String> {
    public Car findByName(String name);
}
