package com.shane51.demo;

import com.shane51.demo.domain.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @GetMapping("/cars/{name}")
    private Car getCar(@PathVariable String name) {
        return null;
    }
}
