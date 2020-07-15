package com.example.demo.controllers.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Measurement {
    private long timestamp;
    private Temperature temperature;

    public static Measurement now(Temperature temperature) {
        return new Measurement(System.currentTimeMillis(), temperature);
    }
}
