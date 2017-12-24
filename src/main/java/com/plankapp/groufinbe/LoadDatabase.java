package com.plankapp.groufinbe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner init(TripRepository repository) {
        return args -> Flux.just(
                new Trip("Ouback Camping"),
                new Trip("Surfing France"),
                new Trip("Snowboarding Alps"))
                .flatMap(repository::save)
                .subscribe(System.out::println);

    }
}
