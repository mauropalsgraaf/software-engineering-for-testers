package com.example.demo.controllers.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MeasurementDTO {
    private long timestamp;
    private double temperature;
}
