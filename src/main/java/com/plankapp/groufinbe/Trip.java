package com.plankapp.groufinbe;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Trip {

    @Id
    private String id;
    private String name;

    public Trip(String name) {
        this.name = name;
    }
}
