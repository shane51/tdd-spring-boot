package com.shane51.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class IntegrationTest {
    @Autowired
    private WebTestClient webClient;
    @Test
    public void shouldGet200() {
        //arrange
        //act
        webClient.get().uri("/cars/prius").exchange().expectStatus().isOk();
        //assert
    }
}
