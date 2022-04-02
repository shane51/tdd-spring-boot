package com.shane51.demo;

import com.shane51.demo.domain.Car;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class CarServiceTest {

    private CarService carService;

    @Mock
    private CarRepository carRepository;

    @BeforeEach
    void setUp() {
        carService = new CarService(carRepository);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void shouldGetCarDetails() {
        given(carRepository.findByName("prius")).willReturn(new Car("prius", "hybrid"));

        Car car = carService.getCarDetails("prius");
        assertThat(car.getName()).isEqualTo("prius");
        assertThat(car.getType()).isEqualTo("hybrid");
    }
}