package com.plankapp.groufinbe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class TripController {
    private final TripRepository repository;

    public TripController(TripRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/trips")
    public Flux<Trip> listing() {
        return repository.findAll();
    }
}
